package basic.java_cursor.education;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //    * (завдання з зірочкою)
        //    Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними
        //    Логіка завдання : оскільки ми не можемо знати скільки в масиві буде чисел парних та непарних,
        //      беремо до уваги що їх точно буде не рівна кількість. Відповідно запам’ятовуємо перше непарне
        //      число та перше парне число та міняємо тільки їх містами.

        int[] big_array = new int[25];
        int even_number = 0;
        int odd_number = 0;
        int even_index = 0;
        int odd_index = 0;
        Random random = new Random();
        int marka_even = 1;
        int marka_odd = 1;

        for (int i = 0; i < big_array.length; i++) {

            big_array[i] = random.nextInt(1000);

        }
        System.out.println("Original  " + Arrays.toString(big_array));

        for (int i = 0; i < big_array.length; i++) {
            if (big_array[i] % 2 == 0 && marka_even == 1) {
                marka_even = 0;
                even_number = big_array[i];
                even_index = i;

            } else if (marka_odd == 1) {
                marka_odd = 0;
                odd_number = big_array[i];
                odd_index = i;

            }
            while (marka_even == 0 && marka_odd == 0) {
                marka_even = 1;
                marka_odd = 1;
                big_array[even_index] = odd_number;
                big_array[odd_index] = even_number;
            }
        }
        System.out.println("Changed   " + Arrays.toString(big_array));
    }
}
