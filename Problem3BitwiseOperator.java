// Find the one non-repeating element in an array where every element repeats twice

package problem.pkg3.bitwise.operator;

public class Problem3BitwiseOperator {

    public static void main(String[] args) {

        int[] a = {2, 4, 1, 7, 4, 2, 1};
        int res = 0;

        for (int i = 0; i < a.length; i++) {
            res = res ^ a[i];
        }
        System.out.println("One Non Repeating Element is : " + res);
    }
}