import java.util.Scanner;

public abstract class Media {
    private String title;
    private String category;
    private float cost;
    private int id;
    private static int increaseID = 0;
    public Media() {
        super();
        id = ++increaseID;
    }
    public Media(String title) {
        super();
        id = ++increaseID;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public Media(String title, String category) {
        super();
        id = ++increaseID;
        this.title = title;
        this.category = category;
    }
    public Media(String title, String category, float cost) {
        super();
        id = ++increaseID;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String toString() {
        return title + " - " + category + " - " + cost + "$" + " - "+ id;
    }
    public void inputInfo(Scanner scanner) {
        System.out.println("Title: ");
        title = scanner.nextLine();
        System.out.println("Category: ");
        category = scanner.nextLine();
        System.out.println("Cost: ");
        cost = scanner.nextFloat();
    }
}