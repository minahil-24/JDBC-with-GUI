import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class FIRST_DATABAE {
    public static void main(String[] args) {
        String driver ="com.mysql.cj.jdbc.Driver";
        String jdbc_url ="jdbc:mysql://localhost:33068/MYSQL";
        String user="root";
        String password="W7301@jqir#";
        String sql_query="create table sty(eno number, ename varchar2(20))";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(jdbc_url,user,password);
            Statement st= con.createStatement();
            st.executeUpdate(sql_query);
            System.out.println("Table created successfully.");
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
