import java.util.Scanner;

public class UC2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = scanner.next();

            System.out.println("Hello " + name);
        }
    }
}
