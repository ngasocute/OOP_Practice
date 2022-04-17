package Lab02;

public class DisplayTriangle {

    public void printStar(int n, int k) {
        int numStar = 2 * k + 1;
        String lineStar = "";

        for (int i = 0; i < n - k; i++) {
            lineStar += " ";
        }
        for (int i = 0; i < numStar; i++) {
            lineStar += "*";
        }
        for (int i = 0; i < n - k; i++) {
            lineStar += " ";
        }
        System.out.println(lineStar);

    }

    public static void main(String args[]) {
        // display triangle with a hight of n stars
        int n = 5;

        for (int i = 0; i < n; i++) {
            new DisplayTriangle().printStar(n, i);
        }

    }
}