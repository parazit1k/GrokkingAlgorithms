package org.PARAZITIK;

import java.util.Arrays;

/*
Найдите наибольшее число в списке
 */
public class task43 {
    public static void main(String[] args) {
        int[] massive = {5,10,3,4,5, 15, 7345, 1, 2, 34, 523};

        System.out.println(max(massive[0], massive));
    }

    public static int max(int max, int[] massive){
        if (massive.length == 0) return max;

        return max(massive[0] > max ? massive[0] : max, Arrays.copyOfRange(massive, 1, massive.length));
    }
}
