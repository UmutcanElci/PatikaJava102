package PatikaKlon;

import PatikaKlon.Model.Operator;
import PatikaKlon.View.OperatorGUI;

public class AppMain {
    public static void main(String[] args) {
        Operator op = new Operator();
        op.setId(1);
        op.setName("Mustafa Çetindağ");
        op.setPass("1234");
        op.setType("operator");
        op.setUname("mustafa");
        OperatorGUI operatorGUI = new OperatorGUI(op);

    }
}
