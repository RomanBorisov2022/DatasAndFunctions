package org.example;

public class ArrayDifference {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println(findDifference(array1)); // Выводит 3 (4 - 1)
        System.out.println(findDifference(array2)); // Выводит 2 (2 - 0)
        System.out.println(findDifference(array3)); // Выводит 4 (5 - 1)
    }

    public static int findDifference(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}

