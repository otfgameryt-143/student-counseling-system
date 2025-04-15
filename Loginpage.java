public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/counselling_db";
        String user = "root";
        String password = "your_password";
        return DriverManager.getConnection(url, user, password);
    }
}
