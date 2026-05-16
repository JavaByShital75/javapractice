package singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSingleToneUtilityImpl {
    public static void main(String[] args) throws SQLException {
        JdbcSingleToneUtility j = JdbcSingleToneUtility.getInstance();
        Connection connection = j.getConnection();
        JdbcSingleToneUtilityImpl jdbc = new JdbcSingleToneUtilityImpl();
        // jdbc.insertData(connection);
        //jdbc.updateData(connection);
        //jdbc.deleteData(connection);
        jdbc.selectData(connection);

    }

    public void insertData(Connection con) throws SQLException {
        String sql = "insert into tyson.cat (cat_id,cat_colour,cat_name) values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 5);
        ps.setString(2, "test");
        ps.setString(3, "romeo");
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("data insert successfully");
        }
    }

    public void updateData(Connection con) throws SQLException {
        String sql = "update cat set cat_name = ? where cat_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "jhella");
        ps.setInt(2, 5);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("data update successfully");
        }
    }

    public void deleteData(Connection con) throws SQLException {
        String sql = "delete from cat where cat_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 5);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("data delete successfully");
        }
    }

    public void selectData(Connection con) throws SQLException {
        String sql = "select * from cat";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet resultSet  = ps.executeQuery();
        System.out.println("cat_id cat_colour cat_name");
        while (resultSet.next()) {
            int catid = resultSet.getInt(1);
            String catColuor = resultSet.getString(2);
            String catName = resultSet.getString(3);
            System.out.println(" "+catid + "    " + catColuor + "     " + catName);
        }

    }
}