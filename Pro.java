public class Pro {

    public static void main(String[] args) {
        System.out.println("Running Basic Jenkins CI Java Test");

        cal calc = new cal();

        int mul = calc.multiply(5, 4);
        int sub = calc.subtract(10, 3);

        System.out.println("Multiply Result: " + mul);
        System.out.println("Subtract Result: " + sub);
    }
}
