package Lab03;

public class DigitalVideoDisc {
    // attribute: title, category, director, length,cost
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    // constructor
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // constructor with title param
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // contructor with no param
    public DigitalVideoDisc() {
    }

    // contrustor with title and category param
    public DigitalVideoDisc(String title, String category) {
        this.title = title;
        this.category = category;
    }

    // contructor with title, category, director param
    public DigitalVideoDisc(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    // contructor with title, category, director, length param
    public DigitalVideoDisc(String title, String category, String director, int length) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
    }

    // title getter
    public String getTitle() {
        return title;
    }

    // title setter
    public void setTitle(String title) {
        this.title = title;
    }

    // category getter
    public String getCategory() {
        return category;
    }

    // category setter
    public void setCategory(String category) {
        this.category = category;
    }

    // director getter
    public String getDirector() {
        return director;
    }

    // director setter
    public void setDirector(String director) {
        this.director = director;
    }

    // length getter
    public int getLength() {
        return length;
    }

    // length setter
    public void setLength(int length) {
        this.length = length;
    }

    // cost getter
    public double getCost() {
        return cost;
    }

    // cost setter
    public void setCost(double cost) {
        this.cost = cost;
    }

}
