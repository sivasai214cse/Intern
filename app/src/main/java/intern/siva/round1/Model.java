package intern.siva.round1;

public class Model {
    private int imageview;
    private String No;

    public Model(int imageview, String no) {
        this.imageview = imageview;
        No = no;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }
}
