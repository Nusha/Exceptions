/** Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
 необходимо как-то оповестить пользователя. **/


import java.util.ArrayList;

public class task3 {
    public static ArrayList<Integer> diffAr(Integer[] arr1, Integer[] arr2) {
        try {
            if (arr2.length != arr1.length) {
                throw new RuntimeException("Длинна одного массива больше другого");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("Массив не может быть равен NULL");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            result.add(arr1[i] - arr2[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] a1 = new Integer[]{9, 8, 7, 6, 5, 4, 3};
        Integer[] a2 = new Integer[]{3, 4, 5, 6, 7, 8};

        System.out.println(diffAr(a1, a2));
    }
}

