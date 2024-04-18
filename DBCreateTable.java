import java.sql.*;

class DBCreateTable {
    public static void main(String args[]) {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8",
                    "root", "");
            st = con.createStatement();

            // SQL statements for creating tables
            String str1 = "CREATE TABLE department(dno INT PRIMARY KEY, dname VARCHAR(40), dloc VARCHAR(50))";
            String str2 = "CREATE TABLE EMPLOYEE(Eno INT PRIMARY KEY, Ename VARCHAR(40), esal DECIMAL(10,2), dno INT, FOREIGN KEY(dno) REFERENCES department(dno))";

            System.out.println(str1);
            st.executeUpdate(str1);

            System.out.println(str2);
            st.executeUpdate(str2);

            System.out.println("Tables created successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: MySQL JDBC driver not found.");
           
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
           
        } 
        
    }
}
