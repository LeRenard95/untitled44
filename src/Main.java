import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many Stars?");
        Scanner scanner = new Scanner(System.in);
        int numbOfStars = scanner.nextInt();

        for (int i = 1; i <= numbOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = numbOfStars - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}