package collections.work;

public abstract class Candidate {
    protected String name;
    protected String address;
    protected String sbd;
    protected int diemCong;

    public Candidate(String name, String address, String sbd, int diemCong) {
        this.name = name;
        this.address = address;
        this.sbd = sbd;
        this.diemCong = diemCong;
    }

    public String getCode() {
        return sbd;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sbd=" + sbd +
                ", diemCong=" + diemCong +
                '}';
    }
}
