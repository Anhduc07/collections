package collections.employees;

import java.time.LocalDate;

public class Intern extends Employee {

    private String major;
    private int semester;
    private String universityName;

    public Intern(String ID,
                  String fullName,
                  LocalDate birthDay,
                  String phone,
                  String email,
                  String major,
                  int semester,
                  String universityName) {
        super(ID, fullName, birthDay, phone, email, 2);

        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        System.out.println("===== INTERN =====");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + fullName);
        System.out.println("BirthDay: " + BirthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.println("University: " + universityName);
        System.out.println("Certificates: " + certificates);
    }
}
