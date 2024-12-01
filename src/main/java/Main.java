import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the side: ");
                side = input.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                input.next();
            }
        }
        double area = calculateHexagonArea(side);
        System.out.printf("The area of the hexagon is %.2f\n", area);
        input.close();
    }

    public static double calculateHexagonArea(double s) {
        return (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
    }
}