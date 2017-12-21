import java.sql.SQLException;

public interface UsersDao<T> {
    void save(T user) throws SQLException;
    T find(String name);
    void update(T user);
    void delete(Long id);
}
