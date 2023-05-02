package Seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S2_task1 {
    public static Float getFloat() {
        float value;
        while (true) {
            System.out.print("Input float number: ");
            try {
                Scanner scan = new Scanner(System.in);
                value = scan.nextFloat();
                scan.close();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Illegal input");
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(getFloat());
    }
}
