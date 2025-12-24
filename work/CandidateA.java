package collections.work;

public class CandidateA extends  Candidate {

    public CandidateA(String name, String address, String sbd, int diemCong) {
        super(name, address, sbd, diemCong);
    }

    @Override
    public String toString() {
        return "[CandidateA: Toán, Li, Hóa]{" +super.toString();

    }
}
