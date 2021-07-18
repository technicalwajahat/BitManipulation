// Find even or odd value by using bitwise operator (AND)

package Problem2BitwiseOperator;

import java.util.*;

public class Problem2BitwiseOperator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = input.nextInt();

        int res = a & 1;

        if (res == 0) {
            System.out.println("Number is EVEN!");
        } 
        else {
            System.out.println("Number is ODD!");
        }
    }
}
