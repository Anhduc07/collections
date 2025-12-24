package collections.employees;

import java.time.LocalDate;

public class Experience extends  Employee {

    private int expInYear;
    private String proSkill;

    public Experience(String ID, String fullName, LocalDate birthDay, String phone, String email, int employeeType, String proSkill) {
        super(ID, fullName, birthDay, phone, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String id, String fullName, LocalDate birthDay, String phone, String email, int employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.println("Experience Employee{" +
                "ID='" + getID() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthDay=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", employeeType=" + getEmployeeType() +
                ", certificates=" + getCertificates() +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}');
    }
}