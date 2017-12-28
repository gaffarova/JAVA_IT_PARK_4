import java.sql.SQLException;

public interface ConsumersDao<T> {
    void save(T consumer) throws SQLException;
    T find(String name);
    void update(T consumer);
    void delete(Long id);
}
