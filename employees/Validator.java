package collections.employees;

import collections.employees.exception.BirthDayException;
import collections.employees.exception.EmailException;
import collections.employees.exception.PhoneException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Validator {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate validateBirthday(String birthday) throws Exception {
        try {
            LocalDate date = LocalDate.parse(birthday, formatter);
            if (date.isAfter(LocalDate.now())) {
                throw new BirthDayException("Ngay sinh khong duoc lon hon ngay hien tai");
            }
            return date;
        } catch (DateTimeParseException e) {
            throw new BirthDayException("Ngay sinh khong hop le, dinh dang dd/MM/yyyy");
        }
    }

    public static void validateEmail(String email) throws EmailException {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(emailRegex)) {
            throw new EmailException("Email khong hop le");
        }
    }

    public static void validatePhone(String phone) throws PhoneException {
        String phoneRegex = "^(\\+84|0)\\d{9}$";
        if (!phone.matches(phoneRegex)) {
            throw new PhoneException("So dien thoai khong hop le");
        }
    }

    public static void validateFullName(String fullName) throws Exception {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new Exception("Ten khong duoc de trong");
        }
    }
}


