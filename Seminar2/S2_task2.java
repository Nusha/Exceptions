package Seminar2;

public class S2_task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            Integer[] intArray = new Integer[9];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException  e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
