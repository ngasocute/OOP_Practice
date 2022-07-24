package hust.soict.globalict.aims.media;

import java.util.Scanner;

public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;
    public DigitalVideoDisc() {
        super();
    }
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }
    public DigitalVideoDisc(String title, String category, String director) {
        super(title, category);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public boolean search(String title) {
        String titleList[] = title.split(" ");
        for(int i = 0; i < titleList.length; i++) {
            if(!this.getTitle().contains(title)) {
                return false;
            }
        }
        return true;
    }
    public String toString() {
        return "dvd - " + super.toString() + " - " + length;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo(scanner);
        System.out.println("Input length: ");
        length = scanner.nextInt();
        System.out.println("Input director: ");
        scanner.nextLine();
        director = scanner.nextLine();
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
