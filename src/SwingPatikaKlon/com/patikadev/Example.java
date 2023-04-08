package SwingPatikaKlon.com.patikadev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame{
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbot;
    private JTextField field_username;
    private JPasswordField field_password;
    private JButton btn_login;

    public Example(){
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedLookAndFeelException e) {
                throw new RuntimeException(e);
            }
        }
        setContentPane(wrapper);
        setSize(600,400);
        setTitle("Uygulama Adi");
        setVisible(true);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (field_username.getText().length() == 0 || field_password.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Alanı doldurunuz !","Hata",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }


}
