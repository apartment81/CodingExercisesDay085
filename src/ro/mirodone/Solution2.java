package ro.mirodone;

public class Solution2 {

     int find(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            int prev = i != 0 ? i - 1 : integers.length - 1;
            int next = i != integers.length -1 ? i + 1 : 0;
            if (isOdd(integers[i] + integers[prev]) && isOdd(integers[i] + integers[next])) {
                return integers[i];
            }
        }
        return 0;
    }

    static boolean isOdd(int n) {
        if ((n & 1) == 0) {
            return false;
        }
        return true;
    }
}
