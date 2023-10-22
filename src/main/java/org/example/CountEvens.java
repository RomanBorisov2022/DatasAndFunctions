package org.example;

public class CountEvens {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println(countEvens(array1)); // Выводит 3
        System.out.println(countEvens(array2)); // Выводит 3
        System.out.println(countEvens(array3)); // Выводит 0
    }

    public static int countEvens(int[] nums) {
        int count = 0; // Переменная для подсчета чётных чисел

        for (int num : nums) {
            if (num % 2 == 0) { // Если число делится на 2 без остатка, то оно чётное
                count++;
            }
        }

        return count;
    }
}
