package collections.work;

public class CandidateB extends Candidate {

    public CandidateB(String name, String address, String sbd, int diemCong) {
        super(name, address, sbd, diemCong);
    }

    @Override
    public String toString() {
        return "[CandidateB: Toán, Hóa, sinh]" + super.toString();

    }
}
