package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcSingleToneUtility {
    public static JdbcSingleToneUtility instance;
    public static Connection connection;

    private JdbcSingleToneUtility() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tyson";
            String user = "root";
            String pass = "root";
            this.connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JdbcSingleToneUtility getInstance() {
        if(instance==null){
            instance =new JdbcSingleToneUtility();

        }
         return instance;

    }
    public Connection getConnection(){
        return connection;
    }
}



