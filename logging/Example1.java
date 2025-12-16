package collections.logging;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example1 {
    private static final Logger logger = Logger.getLogger(Example1.class.getCanonicalName());
    public static void main(String[] args) {

        String message = "This is a log message";
        logger.severe("Severe message");
        logger.warning("Warning message");
        logger.info("Info message");
        logger.config("Config message");
        logger.fine("Fine message");
        logger.finer("Finer message");
        logger.finest("Finest message");

        // log exception
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Lỗi gì xảy ra" , e);
        }

        // log with variable
        String user = "Hoàng Đức Anh";
        int age = 22;
        logger.info(String.format("use %s đã đăng nhập, tuổi: %d", user, age));

        // String format
        logger.info(String.format("use %s đã đăng nhập, tuổi: %d", user, age));

        // hiển thị tất cả các log level
        logger.setLevel(Level.ALL);
    }
    }

