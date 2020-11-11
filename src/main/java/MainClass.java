import java.util.ArrayList;
import java.util.Arrays;

/*  Задание:
1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
 Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
  идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
   необходимо выбросить RuntimeException.
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

2. Написать метод, который проверяет состав массива из чисел 1 и 4.
 Если в нем нет хоть одной четверки или единицы, то метод вернет false;
  Если есть число отличное от 1 или 4 то вернуть false; Написать набор тестов для
   этого метода (по 3-4 варианта входных данных).
[ 1 1 1 4 4 1 4 4 ] -> true
[ 1 1 1 1 1 1 ] -> false
[ 4 4 4 4 ] -> false
[ 1 4 4 1 1 4 3 ] -> false
 */
public class MainClass {
    public static void main(String[] args) { // Для начальной проверки через консоль
        int[] arr1 = {24, 545, 4, 6, 43, 21, 44};
        System.out.println(Arrays.toString(func1(arr1)));
        int[] arr2 = {1, 4, 4};
        System.out.println(func2(arr2));
    }

    public static int[] func1(int[] inArr) {
        for (int i = inArr.length - 1; i >= 0; i--) {
            if (inArr[i] == 4) {
                return Arrays.copyOfRange(inArr, i + 1, inArr.length);
            }
        }
        throw new RuntimeException("В исходном массиве нет 4");
    }

    public static boolean func2(int[] inArr) {
        boolean is1 = false;
        boolean is4 = false;
        boolean isOther = false;
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] == 4) {
                is4 = true;
            }
            if (inArr[i] == 1) {
                is1 = true;
            }
            if (inArr[i] != 1 & inArr[i] != 4) {
                isOther = true;
            }
        }
        return is1 & is4 & !isOther;
    }
}
