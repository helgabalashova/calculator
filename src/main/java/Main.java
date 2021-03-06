import java.util.*;
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Enter a command:");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        while (!command.equals("q")) {
            if  (command.equals("add")) {
                int a = scanner.nextInt();
                int b  = scanner.nextInt();
                int res = calc.add(a, b);
                System.out.println(res);
            }
            else if (command.equals("subtract")) {
                int a = scanner.nextInt();
                int b  = scanner.nextInt();
                int res = calc.subtract(a, b);
                System.out.println(res);
            }
            else if (command.equals("multiply")) {
                int a = scanner.nextInt();
                int b  = scanner.nextInt();
                int res = calc.multiply(a, b);
                System.out.println(res);
            }
            else if (command.equals("divide")) {
                int a = scanner.nextInt();
                int b  = scanner.nextInt();
                int res = calc.divide(a, b);
                System.out.println(res);
            }
            else if (command.equals("fibonacci")) {
                int a = scanner.nextInt();
                int res = calc.fibonacciNumberFinder(a);
                System.out.println(res);
            }
            else if (command.equals("binary")) {
                int a = scanner.nextInt();
                String res = calc.intToBinaryNumber(a);
                System.out.println(res);
            }
            command = scanner.next();
        }
        scanner.close();
    }
}