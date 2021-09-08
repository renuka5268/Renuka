import java.sql.*;
import java.util.Scanner;

public class Jdbc_inheritance {
    static String url = "jdbc:mysql://localhost:3306/assignment";
    static String userName = "root";
   static String pass = "Renu@123";
   static Connection con = null;
    static Statement stm = null;


    public static void main(String args[]) throws Exception {
        dataConnection();
        option();
    }

    public static void option() throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1:input");
            System.out.println("2:get data");
            System.out.println("3:set data");
            System.out.println("4:exit");
            System.out.println("enter the option");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    input();
                    break;
                case 2:
                    getdata();
                    break;
                case 3:
                    setdata();
                    break;
                case 4:
                    return;

            }
        }


    }

    public static void input() throws Exception {
        Scanner sc = new Scanner(System.in);
        int number;
        String sql;
        String text;
        String id;
        System.out.println("enter number of student information you need to enter");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("enter  id");
            id = sc.next();
            System.out.println("enter text");
            text = sc.next();
            stm = con.createStatement();
            sql = "INSERT INTO test VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, text);
            System.out.println(sql);
            stmt.executeUpdate();
        }

    }

    public static void getdata() throws Exception {
        String id;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter id");
        id = sc.next();
        stm = con.createStatement();
        String sql = "select * from test where id='" + id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1) + "," + rs.getString(2));
        }
    }

    public static void setdata() throws Exception {
        String id;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter usn of student");
        id = sc.next();
        stm = con.createStatement();
        String sql = "update test set text='\"+text+\"' where id='" + id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1) + "," + rs.getString(2));
        }

    }

    public static void dataConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, pass);
            if (con != null) {
                System.out.println("jdbc connected");
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
