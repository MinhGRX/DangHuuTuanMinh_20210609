import java.util.Scanner;
public class LinearEquationTwoVariable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a11: ");
        double a11 = input.nextDouble();

        System.out.printf("Enter a12: ");
        double a12 = input.nextDouble();

        System.out.printf("Enter b1: ");
        double b1 = input.nextDouble();

        System.out.printf("Enter a21: ");
        double a21 = input.nextDouble();

        System.out.printf("Enter a22: ");
        double a22 = input.nextDouble();

        System.out.printf("Enter b2: ");
        double b2 = input.nextDouble();

        double t1 = a11/a21;
        double t2 = a12/a22;
        double t3 = b1/b2;

        if(t1 == t2 && t2 != t3){
            System.out.println("The equation has no solution");
        }
        else if(t1 == t2 && t2 == t3){
            System.out.println("The equation is valid for any value of x");
        }
        else{
            double D = a11*a22 - a21*a12;
            double D1 = b1*a22 - b2*a12;
            double D2 = a11*b2 - a21*b1;

            double x1 = D1/D;
            double x2 = D2/D;

            System.out.printf("The solution x1 and x2 are: %.2f and %.2f", x1, x2);
        }
    }
}