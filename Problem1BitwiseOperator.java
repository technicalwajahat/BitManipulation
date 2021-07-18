// Swap two values by using bitwise operator (XOR)

package Problem1BitwiseOperator;

public class Problem1BitwiseOperator {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;

        System.out.println("Values Before SWAP");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Values After SWAP");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
