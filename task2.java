//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class task2 {
    public static int sum2d(String[][] arr) {
        try {
            int sum = 0;
            try {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < 5; j++) {
                        try {
                            int val = Integer.parseInt(arr[i][j]);
                            sum += val;
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("В массиве содержатся не только числа");
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("Индекс находится за границей массива");
            }
            return sum;
        } catch (NullPointerException e) {
            throw new NullPointerException("Массив не может быть NULL");
        }
    }

    public static void main(String[] args) {
        String[][] twoDarr = {{"5", "7", "9", "10"}, {"7", "0", "1", "12"}, {"8", "1", "2", "3"}};

        System.out.println(sum2d(twoDarr));
    }
}
//Null pointer exception
//ArrayIndexOutOfBoundsException
//NumberFormatException