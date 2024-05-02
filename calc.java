import java.util.Scanner;


public class MyProgram
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter variable a: ");
        double varA = scanner.nextDouble();
        
        System.out.print("Enter variable b: ");
        double varB = scanner.nextDouble();
        
       System.out.print("Enter variable c: ");
       double varC = scanner.nextDouble();
       
       double topLine = varB * -1;
       double BSquared = varB*varB;
      
       double squareRoot = BSquared - (4*varA*varC);
       double squareRooted = Math.sqrt(squareRoot);
 
       double bottom = varA*2; 
      
       
       double plusFinal = (topLine + squareRooted)/bottom;
       double minusFinal = (topLine - squareRooted)/bottom;
       
       boolean minusIsnotANum = Double.isNaN(plusFinal);
       boolean plusIsnotANum = Double.isNaN(minusFinal);
       
       if (minusIsnotANum||plusIsnotANum){
           System.out.println("Graph does not cross the Y axis");
       } else {
       System.out.println("plusFinal "+ plusFinal);
       System.out.println("minusFinal " +minusFinal);
       };
       
      
        scanner.close();
    }
}
