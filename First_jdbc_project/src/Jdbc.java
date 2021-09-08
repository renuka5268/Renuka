import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public  class Jdbc {
    static String url="jdbc:mysql://localhost:3306/assignment";
    static String userName="root";
    static String pass="Renu@123";
    public static void main(String args[]){
        Connection con=null;
        Statement stm=null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, userName, pass);
                if (con != null) {
                    System.out.println("jdbc connected");
                }
                stm = con.createStatement();

            } catch (Exception exception) {

            }
        }

}


