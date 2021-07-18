// Shift Operators

package shiftoperator;

public class ShiftOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = -10;

        // Left Shift Operator
        System.out.println("a << 2 = " + (a << 2));

        // Right Shift Operator
        System.out.println("b >> 2 = " + (b >> 2));

        // Unsigned Right Shift Operator
        System.out.println("b >>> 2 = " + (b >>> 2));
    }
}
