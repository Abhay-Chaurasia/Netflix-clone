import java.util.Scanner;

public class dsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isMagicNumber(number)) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is a magic number
    public static boolean isMagicNumber(int num) {
        int sum = 0;
        int originalNum = num;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        return originalNum == sum;
    }
}
