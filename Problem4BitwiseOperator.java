// Find the two non-repeating elements in an array where every element repeats twice 2

package problem.pkg4.bitwise.operator;

public class Problem4BitwiseOperator {

    public static void main(String[] args) {

        int[] a = {3, 7, 4, 7, 8, 2, 3, 4};
        int res = 0;

        for (int i = 0; i < a.length; i++) {
            res = res ^ a[i];
        }
        res = res & -res;

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < a.length; i++) {

            if ((a[i] & res) > 0) {
                temp1 = temp1 ^ a[i];
            } 
            else {
                temp2 = temp2 ^ a[i];
            }
        }
        System.out.println("Two Non Repeating Elements are : " + temp1 + " and " + temp2);
    }
}