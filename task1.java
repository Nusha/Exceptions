//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class task1 {

    public static void div(Integer v1, Integer v2) {
        try {
            int result = v1 / v2;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на 0");
        }
    }

    public static void findSymol(String word, int position) {
        try {
            char result = word.charAt(position);
            System.out.println(result + " находится на позиции " + position);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Позиция находится за пределами строки");
        }
    }

    public static void testInt(String value) {
        try {
            int result = Integer.parseInt(value);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("В строке должны быть только числа");
        }
    }

    public static void getValueByIndex(int[] array, int index) {
        try {
            int value = array[index];
            System.out.println("Значение по индексу " + index + " = " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Переданный индекс находится за пределами массива");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100, 200, 300, 450};
        div(6, 0);
        findSymol("Тестируем", 200);
        testInt("33a");
        getValueByIndex(arr, 5);

    }
}
