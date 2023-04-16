import java.util.Scanner;
import java.lang.Math;

public class SecondDegree {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a: ");
        double a = input.nextDouble();

        System.out.printf("Enter b: ");
        double b = input.nextDouble();

        System.out.printf("Enter c: ");
        double c = input.nextDouble();

        double D = b*b-4*a*c;

        if(a == 0){
            double x = -c/b;
            System.out.printf("The solution of equation is: %.2f", x);
        }
        else{
            if(D < 0){
                System.out.println("The equation has no solution");
            }
            else if (D == 0){
                double x = -b/(2*a);
                System.out.printf("The equation has double solution x1 = x2 = %.2f", x);
            }
            else{
                double T = Math.sqrt(D);
                double x1 = (-b+T)/(2*a);
                double x2 = (-b-T)/(2*a);
                System.out.printf("The equation has two different solution x1 and x2 are: %.2f and %.2f", x1, x2);
            }
        }
    }
}
