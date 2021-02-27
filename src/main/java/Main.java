
public class Main {

    public static void main(String[] args) {
        String command = args[0];
        Calculator calc = new Calculator();
        if  (command.equals("add")) {
            int res = calc.add(Integer.valueOf(args[1]), Integer.valueOf(args[2]));
            System.out.println(res);
        }
        else if (command.equals("subtract")) {
            int res = calc.subtract(Integer.valueOf(Integer.valueOf(args[1])), Integer.valueOf(args[2]));
            System.out.println(res);
        }
        else if (command.equals("fibonacciNumberFinder")) {
            int res = calc.fibonacciNumberFinder(Integer.valueOf(args[1]));
            System.out.println(res);
        }
        else if (command.equals("intToBinaryNumber")) {
            String res = calc.intToBinaryNumber(Integer.valueOf(args[1]));
            System.out.println(res);
        }
        return 0;
    }
}