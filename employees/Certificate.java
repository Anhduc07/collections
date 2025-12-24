package collections.employees;

import java.time.LocalDate;

public class Certificate {
    private String certificateID;
    private String certificateName;
    private String certificateRank;
    private String certificateDate;

    public Certificate(String certificateID, String certificateName, String certificateRank, String certificateDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public String getCertificatedID() {
        return certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public String getCertificatedDate() {
        return certificateDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateID='" + certificateID + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificateDate='" + certificateDate + '\'' +
                '}';
    }
}
