package collections.work;

public class Magazine extends Document {
    private String issueNumber;
    private int monthofRelease;

    public Magazine(String DocumentCode, String Publisher, int numberOfCopies, String issueNumber, int monthofRelease) {
        super(DocumentCode, Publisher, numberOfCopies);
        this.issueNumber = issueNumber;
        this.monthofRelease = monthofRelease;
    }

    @Override
    public String getType() {
        return "Magazine";
    }

    @Override
    public String displayInformation() {
        return "Magazine{" + super.toString() +
                ", issueNumber='" + issueNumber + '\'' +
                ", monthofRelease='" + monthofRelease + '\'' +
                '}';

    }
}
