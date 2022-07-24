package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book() {
        super();
    }
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public static Book createBook() {
        return new Book();
    }
    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }
    public String toString() {
        return "book - " + super.toString() + " - Authors: " + authors.toString();
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo(scanner);
        System.out.println("Input number of authors: ");
        int n5 = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n5; i++) {
            System.out.println("Input author " + (i + 1) + ": ");
            String authorName = scanner.nextLine();
            addAuthor(authorName);
        };
    }
}