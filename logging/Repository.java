package collections.logging;
import java.util.List;
import java.util.Optional;

public interface Repository <T, ID>  {
    void save(T entity);
    Optional<Student> findById(ID id);
    List<T> findAll();
    boolean deleteById(ID id);

}
