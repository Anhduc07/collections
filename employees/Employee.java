package collections.employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class  Employee {
    protected String ID;
    protected String fullName;
    protected LocalDate BirthDay;
    protected String  phone;
    protected String email;

    protected int employeeType; // 0: Experience, 1: Fresher, 2: Intern

    protected static int countEmployee = 0;

    protected List<Certificate> certificates = new ArrayList<>();

    public Employee(String ID, String fullName, LocalDate birthDay, String phone, String email, int employeeType, List<Certificate> certificates) {
        this.ID = ID;
        this.fullName = fullName;
        this.BirthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
    }

    public Employee(String id, String fullName, LocalDate birthDay, String phone, String email, int employeeType) {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        BirthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public static int getCountEmployee() {
        return countEmployee;
    }

    public static void setCountEmployee(int countEmployee) {
        Employee.countEmployee = countEmployee;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public abstract void showInfo(); // hiển thị thông tin nhân viên

    public String getId() {
        return ID;
    }
}
