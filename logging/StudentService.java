package collections.logging;
import java.util.logging.Logger;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private final Logger logger = Logger.getLogger(StudentService.class.getName());

    private final Repository<Student, String> repo;

    public StudentService(Repository<Student, String> repo) {
        this.repo = repo;
    }

    public void createStudent(Student s) {
        if (s == null || s.getStudentId() == null || s.getStudentId().isBlank()) {
            throw new IllegalArgumentException("studentId must not be blank");
        }
        repo.save(s);
        logger.info("Created: " + s);
    }

    public Optional<Student> getById(String id) {
        return repo.findById(id);
    }

    public List<Student> listAll() {
        return repo.findAll();
    }

    public boolean delete(String id) {
        boolean ok = repo.deleteById(id);
        logger.info("Deleted id=" + id + ", ok=" + ok);
        return ok;
    }
}
