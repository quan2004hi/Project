package model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    // Các thông tin cấu hình kết nối cơ sở dữ liệu
    private static final String DB_URL = "jdbc:mysql://localhost:3306/quanlyoto";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1234567";

    // Phương thức để thiết lập kết nối đến cơ sở dữ liệu
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Đăng ký driver JDBC (Ở đây sử dụng MySQL)
            Class.forName("com.mysql.jdbc.Driver");

            // Tạo kết nối đến cơ sở dữ liệu
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

