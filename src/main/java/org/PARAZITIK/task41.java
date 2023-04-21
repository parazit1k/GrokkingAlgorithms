package org.PARAZITIK;

import java.util.Arrays;

/*
Напишите код для функции sum
 */
public class task41 {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 4, 5, 6};

        System.out.println(sum(massive));
    }

    public static int sum(int[] massive) {
        if (massive.length == 0) return 0;

        return massive[0] + sum(Arrays.copyOfRange(massive, 1, massive.length));
    }
}
