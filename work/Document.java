package collections.work;

public abstract class Document {
    protected String DocumentCode;
    protected String Publisher; // nhà sản xuất
    protected int numberOfCopies; // số bản phát hành

    public Document(String DocumentCode, String Publisher, int numberOfCopies) {
        this.DocumentCode = DocumentCode;
        this.Publisher = Publisher;
        this.numberOfCopies = numberOfCopies;
    }

    public String getDocumentCode() {
        return DocumentCode;
    }

    public abstract String displayInformation();

    public abstract String getType();

    @Override
    public String toString() {
        return "Document{" +
                "DocumentCode='" + DocumentCode + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
