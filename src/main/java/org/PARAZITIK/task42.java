package org.PARAZITIK;

import java.util.Arrays;

/*
Напишите рекурсивную функцию для подсчёта элементов в списке
 */
public class task42 {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 4, 5, 6};

        System.out.println(count(massive));
    }

    public static int count(int[] massive) {
        if (massive.length == 0) return 0;

        return 1 + count(Arrays.copyOfRange(massive, 1, massive.length));
    }
}
