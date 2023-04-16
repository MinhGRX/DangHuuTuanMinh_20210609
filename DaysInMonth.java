import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int month = 0;
        int year = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Enter the month (1-12): ");
            month = input.nextInt();
            
            System.out.print("Enter the year: ");
            year = input.nextInt();
            
            if (month < 1 || month > 12 || year < 1) {
                System.out.println("Invalid month/year. Please try again.");
            } else {
                valid = true;
            }
        }

        int days = 0;
        
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        
        System.out.println("There are " + days + " days in month " + month + " of year " + year + ".");5
    }
}