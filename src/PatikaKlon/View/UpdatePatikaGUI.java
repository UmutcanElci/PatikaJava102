package PatikaKlon.View;

import PatikaKlon.Helper.Config;
import PatikaKlon.Helper.Helper;
import PatikaKlon.Model.Patika;

import javax.swing.*;


public class UpdatePatikaGUI extends JFrame {
    private JPanel wrapper;
    private Patika patika;
    private JTextField fld_patikaName;
    private JButton güncelleButton;

    public UpdatePatikaGUI(Patika patika){
        this.patika = patika;
        add(wrapper
        );
        setSize(300,150);
        setLocation(Helper.screenCenter("x",getSize()),Helper.screenCenter("y",getSize()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);


        fld_patikaName.setText(patika.getName());



        güncelleButton.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patikaName)){
                Helper.showMsg("fill");
            }else {
                if (Patika.update(patika.getId(), fld_patikaName.getText())) {
                    Helper.showMsg("done");
                }
                dispose();
            }
        });
    }
}
