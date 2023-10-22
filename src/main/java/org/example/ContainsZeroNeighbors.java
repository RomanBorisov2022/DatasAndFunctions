package org.example;

public class ContainsZeroNeighbors {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 0, 0, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {0, 0, 7, 8, 9};

        System.out.println(hasZeroNeighbors(array1)); // Выводит true
        System.out.println(hasZeroNeighbors(array2)); // Выводит false
        System.out.println(hasZeroNeighbors(array3)); // Выводит true
    }

    public static boolean hasZeroNeighbors(int[] nums) {
        if (nums.length < 2) {
            return false; // В массиве должно быть как минимум два элемента
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true; // Найдены два соседних элемента с нулевым значением
            }
        }

        return false; // Не найдено двух соседних нулей
    }
}

