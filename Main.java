import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add two numbers");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Sum: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);
        scanner.close();
    }
}


// docker build -t aaa .
// docker images
// docker run aaa
//docker run -it aaa