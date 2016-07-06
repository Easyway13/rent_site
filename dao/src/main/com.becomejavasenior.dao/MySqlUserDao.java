import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ghost on 02.07.2016.
 */
public class MySqlUserDao implements UserDao {

    private final Connection connection;
    @Override
    public User create(){
        return null;
    }

    public User read(){
       return null;
    }

    @Override
    public void update(User user){

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> getAll() throws SQLException{
        String sql = "SELECT * FROM user";

        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<User> list = new ArrayList<User>();
        while(rs.next()){
            User user = new User();
            user.setID(rs.getInt("id_user"));
            user.setFirst_name("first_name");
            user.setLast_name("last_name");
            user.setEmail("email");
            user.setPassword("password");
            user.setPhone("phone");
            list.add(user);
        }
        return list;

    }


    public MySqlUserDao(Connection connection) {
        this.connection = connection;
    }
}
