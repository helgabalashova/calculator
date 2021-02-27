
public class Main {

    public static void main(String[] args) {
        String command = args[0];
        Calculator calc = new Calculator();
        if  (command.equals("add")) {
            int res = calc.add(args[1], args[2]);
            System.out.println(res);
        }
        else if (command.equals("subtract")) {
            int res = calc.subtract(args[1], args[2]);
            System.out.println(res);
        }
        else if (command.equals("fibonacciNumberFinder")) {
            int res = calc.fibonacciNumberFinder(args[1]);
            System.out.println(res);
        }
        else if (command.equals("intToBinaryNumber")) {
            int res = calc.intToBinaryNumber(args[1]);
            System.out.println(res);
        }
        return 0;
    }
}