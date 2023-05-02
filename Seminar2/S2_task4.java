package Seminar2;

import java.util.Scanner;

public class S2_task4 {
    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                System.out.print("Input string: ");
                Scanner scan = new Scanner(System.in);
                String input = scan.nextLine();
                System.out.println("String is: " + input);
                if (input.isBlank()) {
                    throw new Exception("Please, no blank strings");
                }
                scan.close();
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}