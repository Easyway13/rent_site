import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Ghost on 01.07.2016.
 */
public interface DaoFactory {


    public Connection getConnection() throws SQLException;

    public UserDao getUserDao(Connection connection);

    public PropertyDao getPropertyDao(Connection connection);

}
