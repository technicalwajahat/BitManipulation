// Bitwise Operators (AND, OR, NOT, XOR)

package BitwiseOperator;

public class BitwiseOperator {

    public static void main(String[] args) {

        int a = 6; // 0110
        int b = 4; // 0100

        // AND OPERATOR
        System.out.println("AND = a&b = " + (a & b));

        // OR OPERATOR
        System.out.println("OR = a|b = " + (a | b));

        // NOT OPERATOR
        System.out.println("NOT = ~a = " + ~a);

        // XOR OPERATOR
        System.out.println("XOR = a^b = " + (a ^ b));
    }
}