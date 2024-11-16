package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String url = "jdbc:mysql://localhost:3306/college";
    private static final String username = "root";
    private static final String password = "root";

    public Connection getConnection() {
        Connection connection;

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

}
