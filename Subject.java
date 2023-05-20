package Application2;

public class Subject {
    private int sId;
    private String sName;

    private double sFees;
    private  Subject sSub;
    private double sMarks;

    public Subject(int sid, String sname, double sfees) {

    }


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getsMarks() {
        return sMarks;
    }

    public void setsMarks(double sMarks) {

        this.sMarks = sMarks;
    }

    public Subject getsSub() {

        return sSub;
    }

    public void setsSub(Subject sSub) {

        this.sSub = sSub;
    }
}
