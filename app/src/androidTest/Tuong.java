public class Tuong {

    String ten;
    String lop;
    int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Tuong(String ten, String lop, int tuoi) {
        this.ten = ten;
        this.lop = lop;
        this.tuoi = tuoi;
    }

    public static void addData()
    {
        Tuong tuong = new Tuong("Khanh db", "12DHTH11", 21);
    }

}