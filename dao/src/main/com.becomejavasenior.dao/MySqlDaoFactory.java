import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlDaoFactory implements DaoFactory {

    private static final String url = "jdbc:mysql://localhost:3306/rent_site";
    private static final String user = "root";
    private static final String password = "4321qwert";
    private static final String driver = "com.mysql.jdbc.Driver";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user,password);
    }

    @Override
    public PropertyDao getPropertyDao(Connection connection) {
        return null;
    }

    @Override
    public UserDao getUserDao(Connection connection)
    {
        return new MySqlUserDao(connection);
    }

    public MySqlDaoFactory() {
        try{
        Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    }

