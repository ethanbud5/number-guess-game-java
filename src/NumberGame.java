import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
    }
}
