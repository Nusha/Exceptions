/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
 * не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 *
 */


import java.util.ArrayList;

public class task4 {
    public static ArrayList<Integer> divArr(Integer[] arr1, Integer[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не может быть равен NULL");
        }

        if (arr2.length != arr1.length) {
            throw new RuntimeException("Длинна одного массива больше другого");
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) throw new RuntimeException("Ошибка: деление на ноль");
            result.add(arr1[i] / arr2[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] a1 = new Integer[]{9, 8, 7, 6, 5, 4, 3};
        Integer[] a2 = new Integer[]{3, 4, 5, 1, 7, 8, 1};

        System.out.println(divArr(a1, a2));
    }
}

