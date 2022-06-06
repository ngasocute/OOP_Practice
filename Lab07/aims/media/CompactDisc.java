package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Comparable;

public class CompactDisc extends Disc implements Playable, Comparable<CompactDisc> {
    private String director;
    private int length;
    private String artist;
    ArrayList<Track> tracks = new ArrayList<Track>();


    public String toString1() {

        return "CompactDisc{" +
                "director='" + director + '\'' +
                ", length=" + length +
                ", artist='" + artist +
                '}';
    }

    public CompactDisc() {
        super();
    }


    public CompactDisc(String title, String category, float cost, int length, String director, String director1, int length1, String artist, ArrayList<Track> tracks) {
        super(title, category, cost, length, director);
        this.director = director1;
        this.length = length1;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }


    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        int check=0;
        for (int i=0;i<tracks.size();i++) {
            if (track==tracks.get(i)) {
                check=1;
                System.out.println("The track "+track.getTitle() +" already exists!");
            }
        }
        if (check==0) {
            tracks.add(track);
            System.out.println("The track "+track.getTitle()+" has been added!");
        }
    }
    public void removeTrack(Track track) {
        int check =0;
        for (int i=0;i<tracks.size();i++) {
            if (track == tracks.get(i)) {
                check =1;
                tracks.remove(i);
                System.out.println("The track "+track.getTitle()+" has been removed!");
            }
        }
        if (check==0) System.out.println("The track "+track.getTitle()+" doesn't exist!");
    }
    public void getToTalLength() {
        int sumLength=0;
        if (tracks.size()==0) {
            System.out.println("There's no tracks in CD");
        } else {
            for (int i=0;i<tracks.size();i++) {
                sumLength += tracks.get(i).getLength();
            }
            System.out.println("The total length in CD: "+sumLength);
        }
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
        System.out.println("Playing CD "+this.getTitle());
        System.out.println("Artist: "+this.getArtist());
        getLength();
        for (int i=0;i<tracks.size();i++) {
            tracks.get(i).play();
        }
    }
    public int compareTo (CompactDisc cd) {
        // compare title
        if (this.getTitle().compareTo(cd.getTitle()) > 0) {
            return 1;
        } else if (this.getTitle().compareTo(cd.getTitle()) < 0) {
            return -1;
        } else return 0;
        }
}