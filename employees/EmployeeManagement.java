package collections.employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {

    private final List<Employee> employees = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    //ADD employee/
    public void addEmployee() {
        try {
            System.out.println("0.Experience  1.Fresher  2.Intern");
            System.out.print("Select: ");
            int type = Integer.parseInt(sc.nextLine());

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("FullName: ");
            String name = sc.nextLine();
            Validator.validateFullName(name);

            System.out.print("BirthDay (dd/MM/yyyy): ");
            LocalDate birthDay = Validator.validateBirthday(sc.nextLine());

            System.out.print("Phone: ");
            String phone = sc.nextLine();
            Validator.validatePhone(phone);

            System.out.print("Email: ");
            String email = sc.nextLine();
            Validator.validateEmail(email);

            Employee e;

            if (type == 0) {
                System.out.print("Exp in year: ");
                int exp = Integer.parseInt(sc.nextLine());
                System.out.print("Pro skill: ");
                String skill = sc.nextLine();

                e = new Experience(id, name, birthDay, phone, email, exp, skill);

            } else if (type == 1) {
                System.out.print("Graduation date (dd/MM/yyyy): ");
                LocalDate gd = Validator.validateBirthday(sc.nextLine());
                System.out.print("Graduation rank: ");
                String rank = sc.nextLine();
                System.out.print("Education: ");
                String edu = sc.nextLine();

                e = new Fresher(id, name, birthDay, phone, email, gd, rank, edu);

            } else if (type == 2) {
                System.out.print("Major: ");
                String major = sc.nextLine();
                System.out.print("Semester: ");
                int semester = Integer.parseInt(sc.nextLine());
                System.out.print("University: ");
                String uni = sc.nextLine();

                e = new Intern(id, name, birthDay, phone, email, major, semester, uni);

            } else {
                System.out.println("Type khong hop le!");
                return;
            }

            employees.add(e);
            System.out.println("Added successfully!");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // display all employees
    public void showAll() {
        if (employees.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        employees.forEach(Employee::showInfo);
    }

    // find employee by ID
    private Employee findById(String id) {
        if (id == null)
            return null;
        String target = id.trim();
        for (Employee e : employees) {
            String checkId = e.getID();
            if (checkId != null && checkId.equalsIgnoreCase(target)) {
                return e;
            }
        }
        return null;
    }

    //update employee
    public void updateEmployee() {
        System.out.print("Nhap ID can sua: ");
        Employee e = findById(sc.nextLine());

        if (e == null) {
            System.out.println("Khong tim thay!");
            return;
        }

        try {
            System.out.print("new phone (Enter bo qua): ");
            String phone = sc.nextLine();
            if (!phone.isBlank()) {
                Validator.validatePhone(phone);
                e.phone = phone;
            }

            System.out.print("new Email (Enter bo qua): ");
            String email = sc.nextLine();
            if (!email.isBlank()) {
                Validator.validateEmail(email);
                e.email = email;
            }

            System.out.println("✔ Cap nhat thanh cong!");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


    // search employee by ID
    public void searchEmployeeById() {
        System.out.print("Nhap ID nhân viên cần tìm: ");
        Employee e = findById(sc.nextLine());

        if (e == null) {
            System.out.println("Khong tim thay!");
            return;
        }
        e.showInfo();
    }

    /* DELETE */
    public void deleteEmployee() {
        System.out.print("Nhap ID can xoa: ");
        Employee e = findById(sc.nextLine());

        if (e == null) {
            System.out.println("Khong tim thay!");
            return;
        }

        employees.remove(e);
        System.out.println("Deleted successfully!");
    }

    // Find by type
    public void findExperience() {
        employees.stream()
                .filter(e -> e instanceof Experience)
                .forEach(Employee::showInfo);
    }

    public void findFresher() {
        employees.stream()
                .filter(e -> e instanceof Fresher)
                .forEach(Employee::showInfo);
    }

    public void findIntern() {
        employees.stream()
                .filter(e -> e instanceof Intern)
                .forEach(Employee::showInfo);
    }

    // menu method
    public void menu() {
        while (true) {
            System.out.println("""
                \n1.Them
                2.Hien thi
                3.Sua
                4.Xoa
                5.Tim Experience
                6.Tim Fresher
                7.Tim Intern
                8.Tim kiem theo ID
                0.Thoat
                """);

            switch (sc.nextLine()) {
                case "1" -> addEmployee();
                case "2" -> showAll();
                case "3" -> updateEmployee();
                case "4" -> deleteEmployee();
                case "5" -> findExperience();
                case "6" -> findFresher();
                case "7" -> findIntern();
                case "8" -> searchEmployeeById();
                case "0" -> { return; }
                default -> System.out.println("Lua chon sai!");
            }
        }
    }
}
