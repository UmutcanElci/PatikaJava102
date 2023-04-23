package PatikaKlon.View;

import PatikaKlon.Helper.Config;
import PatikaKlon.Helper.Helper;
import PatikaKlon.Model.Operator;
import PatikaKlon.Model.Patika;
import PatikaKlon.Model.SchoolUser;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Objects;

public class OperatorGUI extends JFrame {

    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_userList;
    private JScrollPane scrl_userList;
    private JTable tbl_userList;
    private JPanel pnl_userForm;
    private JTextField fld_userName;
    private JTextField fld_userUName;
    private JTextField fld_userPass;
    private JComboBox cmb_userType;
    private JButton btn_userAdd;
    private JTextField fld_userId;
    private JButton btn_userDelete;
    private JTextField fld_searchUsername;
    private JTextField fld_searchUName;
    private JComboBox cmb_searchUserType;
    private JButton btn_UserSearch;
    private JPanel pnl_patikaList;
    private JScrollPane scrl_patikaList;
    private JTable tbl_patikaList;
    private JPanel pnl_patikaAdd;
    private JTextField fld_patikaName;
    private JButton btn_patikaAdd;
    private final Operator operator;

    private DefaultTableModel mdl_userList;
    private Object[] row_userList;


    private DefaultTableModel mdl_patikaList;
    private Object[] row_patikaList;
    private JPopupMenu patikaMenu;


    public OperatorGUI(Operator operator){
        this.operator = operator;
        Helper.setLayout();
        add(wrapper);
        setSize(1000,650);
        int x = Helper.screenCenter("x",getSize());
        int y = Helper.screenCenter("y",getSize());
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_welcome.setText("Hoşgeldin " +operator.getName());


        //ModelUserList

        mdl_userList = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_userList = {"ID","Ad Soyad","Kullanıcı Adı","Şifre","Üyelik Tipi"};
        mdl_userList.setColumnIdentifiers(col_userList);
        /*
        mdl_userList.setColumnIdentifiers(col_userList);
        mdl_userList.addRow();
         */
        row_userList = new Object[col_userList.length];
        refreshModel();

        tbl_userList.setModel(mdl_userList);
        tbl_userList.getTableHeader().setReorderingAllowed(false);



        tbl_userList.getSelectionModel().addListSelectionListener(e -> {
          try {
              String selectedRowId = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),0).toString();
              fld_userId.setText(selectedRowId);
          }catch (Exception exception){

          }
        });


        tbl_userList.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE){
                int userId = Integer.parseInt(tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 0).toString());
                String userName = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),1).toString();
                String userUName = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),2).toString();
                String userPass = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),3).toString();
                String userType = tbl_userList.getValueAt(tbl_userList.getSelectedRow(),4).toString();

                if (SchoolUser.updateUser(userId,userName,userUName,userPass,userType)){
                    Helper.showMsg("done");

                }


                refreshModel();
            }
        });


        patikaMenu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Güncelle");
        JMenuItem deleteMenu = new JMenuItem("Sil");
        patikaMenu.add(updateMenu);
        patikaMenu.add(deleteMenu);

        updateMenu.addActionListener(e -> {
            int select_id = Integer.parseInt(tbl_patikaList.getValueAt(tbl_patikaList.getSelectedRow(),0).toString());
            UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(Patika.getFetch(select_id));
            updatePatikaGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPatikaModel();
                }
            });
        });


        deleteMenu.addActionListener(e -> {
            if (Helper.confirm("sure")){
                int select_id = Integer.parseInt(tbl_patikaList.getValueAt(tbl_patikaList.getSelectedRow(),0).toString());
                if (Patika.delete(select_id)){
                    Helper.showMsg("done");
                    loadPatikaModel();
                }else {
                    Helper.showMsg("error");
                }
            }
        });

        mdl_patikaList =new DefaultTableModel();
        Object[] col_patikaList = {"ID","Patika Adı"};
        mdl_patikaList.setColumnIdentifiers(col_patikaList);
        row_patikaList = new Object[col_patikaList.length];
        loadPatikaModel();

        tbl_patikaList.setModel(mdl_patikaList);
        tbl_patikaList.setComponentPopupMenu(patikaMenu);
        tbl_patikaList.getTableHeader().setReorderingAllowed(false);
        tbl_patikaList.getColumnModel().getColumn(0).setMaxWidth(60);

        tbl_patikaList.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selectedRow = tbl_patikaList.rowAtPoint(point);
                tbl_patikaList.setRowSelectionInterval(selectedRow,selectedRow);
            }
        });


        btn_userAdd.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_userName) || Helper.isFieldEmpty(fld_userPass) || Helper.isFieldEmpty(fld_userUName)){
                Helper.showMsg("fill");
            }else {
                String name = fld_userName.getText();
                String uname = fld_userUName.getText();
                String pass = fld_userPass.getText();
                String type = Objects.requireNonNull(cmb_userType.getSelectedItem()).toString();
                if (SchoolUser.add(name,uname,pass,type)){
                    Helper.showMsg("done");
                    refreshModel();
                    fld_userName.setText(null);
                    fld_userPass.setText(null);
                    fld_userUName.setText(null);
                }
            }
        });


        btn_userDelete.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_userId)){
                Helper.showMsg("fill");
            }else {
               if (Helper.confirm("sure")){
                   int userId = Integer.parseInt(fld_userId.getText());
                   if (SchoolUser.deleteUser(userId)){
                       Helper.showMsg("done");
                       refreshModel();
                   }else{
                       Helper.showMsg("error");
                   }
               }
            }
        });




        btn_UserSearch.addActionListener(e -> {
            String name = fld_searchUsername.getText();
            String uname = fld_searchUName.getText();
            String type = cmb_searchUserType.getSelectedItem().toString();
            String query = SchoolUser.searchQuery(name,uname,type);
            ArrayList<SchoolUser> searching = SchoolUser.searchUser(query);

            refreshModel(searching);
        });


        btn_logout.addActionListener(e -> {
            dispose();
        });



        btn_patikaAdd.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patikaName)){
                Helper.showMsg("fill");
            }else{
                if (Patika.add(fld_patikaName.getText())){
                    Helper.showMsg("done");
                    loadPatikaModel();
                    fld_patikaName.setText(null);
                }else{
                    Helper.showMsg("error");
                }
            }
        });
    }

    private void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patikaList.getModel();
        clearModel.setRowCount(0);
        int i = 0 ;
        for (Patika obj : Patika.getList()){
            i =0;
            row_patikaList[i++] = obj.getId();
            row_patikaList[i++] = obj.getName();
            mdl_patikaList.addRow(row_patikaList);
        }
    }

    public void refreshModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);

        ArrayList<SchoolUser> userList = SchoolUser.getList();

        for (SchoolUser obj : userList){
            int i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getName();
            row_userList[i++] = obj.getUname();
            row_userList[i++] = obj.getPass();
            row_userList[i++] = obj.getType();

            mdl_userList.addRow(row_userList);
        }
    }
    public void refreshModel(ArrayList<SchoolUser> list){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);


        for (SchoolUser obj : list){
            int i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getName();
            row_userList[i++] = obj.getUname();
            row_userList[i++] = obj.getPass();
            row_userList[i++] = obj.getType();

            mdl_userList.addRow(row_userList);
        }
    }
}
