package Lab02;

import java.util.Scanner;

public class InputFromKeyBoard {
    // main function
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();
        System.out.println("Mrs/Ms " + name + "," + " age " + age + " years old. " + "Your hight is " + height + ".");

    }

}
