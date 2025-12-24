package collections.employees;

import java.time.LocalDate;

public class Fresher extends  Employee {

    private LocalDate graduationDate;
    private String  graduationRank;
    private String  education;

    public Fresher(String ID, String fullName, LocalDate birthDay, String phone, String email, LocalDate graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        System.out.println( "Fresher{" +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", BirthDay=" + BirthDay +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                ", certificates=" + certificates +
                '}');
    }
}
