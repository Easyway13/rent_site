import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ghost on 01.07.2016.
 */
public interface UserDao {

    public User create();
    public User read();
    public void update(User user);
    public void delete(User user);
    public List<User> getAll() throws SQLException;

}
