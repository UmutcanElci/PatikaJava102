package JDBC;

import java.sql.*;

public class DatabaseConnect {
    public static final String Url = "jdbc:postgresql://localhost:5432/sms";
    public static final  String Username = "postgres";
    public static final String password = "password";

    public static void main(String[] args) {
        Connection connection = null;
        String sql = "SELECT * FROM students";
        try {
            connection = DriverManager.getConnection(Url,Username,password);
            System.out.println("Connected !");
            Statement st = connection.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                System.out.println(data.getInt("id"));
                System.out.println(data.getString("email"));
                System.out.println(data.getString("first_name"));
                System.out.println(data.getString("last_name"));

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println("Connection Error!");
        }
    }
}
