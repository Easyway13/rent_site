import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ghost on 01.07.2016.
 */
public interface PropertyDao {

    public Property create();
    public Property read();
    public void update(Property property);
    public void checkAvailability(Property property, String check_in, String check_out);
    public void reservation(Property property);
    public void comments(Property property);
    public void delete(Property property);
    public List<Property> getAll() throws SQLException;
}
