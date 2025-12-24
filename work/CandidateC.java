package collections.work;

public class CandidateC extends  Candidate {
    public CandidateC(String name, String address, String sbd, int diemCong) {
        super(name, address, sbd, diemCong);
    }

    @Override
    public String toString() {
        return "[CandidateC : Van, su, dia] " +super.toString();
    }
}
