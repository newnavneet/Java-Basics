package JDBC;

import java.sql.*;

public class One {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbconnect", "root", "Krishna@123"
            );


            Statement s = con.createStatement();


            s.execute("INSERT INTO users VALUES (1, 'xyz', 'xyz@gmail.com', 25)");
            s.execute("INSERT INTO users VALUES (2, 'abc', 'abc@gmail.com', 37)");
            s.execute("INSERT INTO users VALUES (3, 'pqr', 'pqr@gmail.com', 41)");

            s.execute("UPDATE users SET age = 26 WHERE id = 1");
            s.execute("DELETE FROM users WHERE id = 1");


            ResultSet rs = s.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3) + " " +
                                rs.getInt(4)
                );
            }

            System.out.println("Data added successfully.");


            rs.close();
            s.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
