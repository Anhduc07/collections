package collections.work;

public class Newspaper extends Document{
    private String releaseDate;

    public Newspaper(String DocumentCode, String Publisher, int numberOfCopies, String releaseDate) {
        super(DocumentCode, Publisher, numberOfCopies);
        this.releaseDate = releaseDate;

    }

    @Override
    public String displayInformation() {
        return "Newspaper";
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String toString() {
        return "Newspaper{" + super.toString() +
                "releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
