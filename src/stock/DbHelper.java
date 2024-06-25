package stock;

import java.sql.*;
/**
 *
 * @author ismail
 */
public class DbHelper {
    private String userName = "root";
    private String password = "123456";
    private String host = "localhost";
    private String port = "3306";
    private String database = "stock";
    
    public Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage(SQLException exception, String methodName) {
        System.out.println(methodName + " - " + exception.getMessage());
        System.out.println(methodName + " - " + exception.getErrorCode());
    }
}
