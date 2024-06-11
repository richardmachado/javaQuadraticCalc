import java.util.Scanner;

public class file
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter variable a: ");
            double varA = scanner.nextDouble();
            
            System.out.print("Enter variable b: ");
            double varB = scanner.nextDouble();
            
            System.out.print("Enter variable c: ");
            double varC = scanner.nextDouble();

            double squareRoot = Math.sqrt((varB*varB) - (4*varA*varC));
            double bottom = varA*2;
 
            double plusFinal = ((varB*-1)+ squareRoot)/bottom;
            double minusFinal = ((varB*-1) - squareRoot)/bottom; 
            
            if (varC>=0.0 && varA>=0.0 || varA<=0.0 && varC<=0.0){
                System.out.println("A and C cannot be positive/negative at the same time");
            } else {
                System.out.printf( "x= %.3f\n", plusFinal);
                System.out.println("x= " + minusFinal);
            }
        }
    }
}
