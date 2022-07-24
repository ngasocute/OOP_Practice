package hust.soict.globalict.aims.media;
import java.lang.Comparable;


public class Track implements Playable, Comparable<Track> {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Track(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public int compareTo (Track track) {
        if (this.getTitle().compareTo(track.getTitle()) > 0) {
            return 1;
        } else if (this.getTitle().compareTo(track.getTitle()) < 0) {
            return -1;
        } else return 0;
        }
}
