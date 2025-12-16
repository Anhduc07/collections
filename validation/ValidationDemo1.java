package collections.validation;

public class ValidationDemo1 {

    static record StudentCreateRequest(String name, int age, String svID) {}

    // Validate chỉ bằng 1 method trong cùng class
    static void validate(StudentCreateRequest req) {
        if (req == null) {
            throw new IllegalArgumentException("request must not be null");
        }

        if (req.svID() == null || req.svID().isBlank()) {
            throw new IllegalArgumentException("svID must not be blank");
        }

        if (req.name() == null || req.name().isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }

        if (req.age() < 16 || req.age() > 120) {
            throw new IllegalArgumentException("age must be in [16..120]");
        }
    }

    public static void main(String[] args) {
        System.out.println("Validation Demo 1");
        StudentCreateRequest ok = new StudentCreateRequest("Duc Anh", 22, "21021555");
        validate(ok);
        System.out.println("OK passed: " + ok);

        // Case FAIL
        try {
            StudentCreateRequest bad = new StudentCreateRequest(" ", 10, "");
            validate(bad);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
