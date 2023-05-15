import java.util.Scanner;
public class LinearEquation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a: ");
        double a = input.nextDouble();

        System.out.printf("Enter b: ");
        double b = input.nextDouble();

        if (a == 0 && b == 0){
            System.out.println("The equation is valid for any value of x");
        }
        else if (a == 0 && b != 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = -b/a;
            System.out.printf("The solution is x: %.2f", x);
        }
        input.close();
    }
}
