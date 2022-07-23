package Problem4;

import java.util.Arrays;

public class ApplicationDriver {
    static class Solution {
        public static int[] solution(int[] A, int k) {
            int[] result = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                result[(i + k) % A.length] = A[i];
            }
            return result;
        }

        public static void main(String[] args) {
            int[] e = {3, 4, 5, 4, 2, 7};
            int k = 2;
            System.out.println(Arrays.toString(e));
            System.out.println(Arrays.toString(Solution.solution(e,k)));

        }


    }
}