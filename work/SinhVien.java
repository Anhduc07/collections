package collections.work;

public class SinhVien {
    private String name;
    private float SoccerLT;
    private float SoccerTH;
    private int id;


    public SinhVien(String name, float soccerLT, float soccerTH, int id) {
        this.name = name;
        this.SoccerLT = soccerLT;
        this.SoccerTH = soccerTH;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSoccerLT() {
        return SoccerLT;
    }

    public void setSoccerLT(float soccerLT) {
        SoccerLT = soccerLT;
    }

    public float getSoccerTH() {
        return SoccerTH;
    }

    public void setSoccerTH(float soccerTH) {
        SoccerTH = soccerTH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDiemTrungBinh() {
        return (SoccerLT + SoccerTH) / 2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", SoccerLT=" + SoccerLT +
                ", SoccerTH=" + SoccerTH +
                ", id=" + id +
                '}';
    }
}


