/*Первый семинар.
        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        Пункты реализовать в методе main
        *Пункты реализовать в разных методах

        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
*/
import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        int k = 2000;
        int i = new Random().nextInt(k);
        System.out.println("i = " + i);
        // старший бит

        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println("n = " + n);

        // инициализация массивов
        int[] m1 = new int[Short.MAX_VALUE - i];
        int[] m2 = new int[i - Short.MIN_VALUE];
        int count = 0;
        // заполнение массива m1 n кратными числами n
        System.out.println("m1:");
        for(int index = i; index < Short.MIN_VALUE; index++)
        {
            if (index % n == 0) {
                m1[count] = index;
                System.out.println(m2[count]);
                count++;
            }
        }
        count = 0;
        System.out.println("m2:");
        for(int index = Short.MIN_VALUE; index < i; index++)
        {
            if (index % n == 0) {
                m2[count] = index;
                System.out.println(m2[count]);
                count++;
            }

        }


    }
}
