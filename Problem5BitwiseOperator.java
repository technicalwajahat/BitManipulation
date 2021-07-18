// Find the one non-repeating element in an array where every element repeats thrice

package Problem5BitwiseOperator;

public class Problem5BitwiseOperator {

    public static void main(String[] args) {

        int a[] = {6, 2, 5, 2, 2, 6, 6};
        int k = 3;

        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;
        int count[] = new int[INT_SIZE];

        for (int i = 0; i < INT_SIZE; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((a[j] & (1 << i)) != 0) {
                    count[i] += 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < INT_SIZE; i++) {
            res += (count[i] % k) * (1 << i);
        }
        System.out.println("One Non-Repeating Element is : " + res);
    }
}
