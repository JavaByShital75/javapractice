package singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionImpl {
    private  static Connection con;
    public void getSelect() throws SQLException {
        String sql= "select * from team";
        PreparedStatement p =con.prepareStatement(sql);
        ResultSet s =p.executeQuery();
        System.out.println("id name city");
        System.out.println(".......................................");
        while(s.next()){
System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3));
        }
    }
    public void delete() throws SQLException {
       PreparedStatement ps= con.prepareStatement("delete from team where id =? and name= ?");
       ps.setInt(1, 4);
       ps.setString(2,"sinu");
       ps.executeUpdate();
    }
    public void insert() throws SQLException {
        PreparedStatement p=con.prepareStatement("insert into tyson.team (id, name, city) values(?,?,?)");
        p.setInt(1,100);
        p.setString(2,"sakshi");
        p.setString(3,"bangalore");
       int i= p.executeUpdate();
       if(i>0){
           System.out.println("inserted data succesfully");

       }
    }
    public void update() throws SQLException {
        PreparedStatement st=con.prepareStatement("update team set name=?, city=? where id =?");
        st.setString(1,"radha");
        st.setString(2,"vrindawan");
        st.setInt(3,100);
        int ii=st.executeUpdate();
        if(ii>0){
            System.out.println("record data succesfully");

        }
        else {
            System.out.println("failed to update ");
        }
    }
    public static void main(String[] args) throws SQLException {
        JDBCSingleTone jdbc=JDBCSingleTone.getInstance();
         con =jdbc.getConnection();
        ConnectionImpl connection=new ConnectionImpl();
        //connection.delete();
        //connection.getSelect();
       // connection.insert();
        connection.update();
        connection.getSelect();





    }
}
