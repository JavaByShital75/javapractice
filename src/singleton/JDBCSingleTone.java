package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCSingleTone {
    private  static JDBCSingleTone instance;
    private  static Connection connection;

    private JDBCSingleTone(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tyson";
            String user ="root";
            String pass ="root";
          this.connection = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException e) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


 public static JDBCSingleTone getInstance(){
        if (instance==null){
            instance = new JDBCSingleTone();
        }
        return instance;
 }

 public static Connection getConnection(){
        return connection;
 }

}
