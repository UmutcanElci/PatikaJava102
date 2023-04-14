package PatikaKlon.Model;

import PatikaKlon.Helper.DBConnector;
import PatikaKlon.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SchoolUser {
    private int id;
    private String name;
    private String uname;
    private String pass;
    private String type;

    public SchoolUser() {
    }

    public SchoolUser(int id, String name, String uname, String pass, String type) {
        this.id = id;
        this.name = name;
        this.uname = uname;
        this.pass = pass;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<SchoolUser> getList(){
        ArrayList<SchoolUser> arrayList = new ArrayList<>();
        String query = "SELECT * FROM public.\"SchoolUser\"";
        SchoolUser obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                obj = new SchoolUser();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("account_type"));
                arrayList.add(obj);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }



    public static boolean add(String name,String uname,String pass,String type){
        String query = "INSERT INTO public.\"SchoolUser\"(name, uname, pass, account_type)VALUES (?, ?, ?, ?);";
        SchoolUser findUser = SchoolUser.getFetch(uname);
        if (findUser != null){
            Helper.showMsg("Kullanıcı ismi mevcut!");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,uname);
            pr.setString(3,pass);
            pr.setString(4,type);
            int response = pr.executeUpdate();

            if (response == -1){
                Helper.showMsg("error");
                return false;
            }

            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static SchoolUser getFetch(String uname){
        SchoolUser obj = null;
        String query = "SELECT * FROM public.\"SchoolUser\" WHERE uname = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,uname);
            ResultSet rs = pr.executeQuery();

            if (rs.next()){
                obj = new SchoolUser();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("account_type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

    public static boolean deleteUser(int id){
        String query = "DELETE FROM public.\"SchoolUser\" WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
