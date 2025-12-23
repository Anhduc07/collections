package collections.work;

public class Book extends Document{
    private String author;
    private int title;

    public Book(String DocumentCode, String Publisher, int numberOfCopies, String author, int title) {
        super(DocumentCode, Publisher, numberOfCopies);
        this.author = author;
        this.title = title;
    }

    @Override
    public String getType() {
        return "Book";
    }


    @Override
    public String displayInformation() {
        return "book";
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
