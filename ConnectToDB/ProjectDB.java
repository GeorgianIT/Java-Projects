package ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/girrafe";
        String username = "root";
        String password = "asdzxc123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1 )+ " "+resultSet.getString(2)+ " " + resultSet.getString(3));
            }

            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
