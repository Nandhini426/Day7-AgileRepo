public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        if (calc.add(2, 3) == 5) {
            System.out.println("Test Add ✅ PASSED");
        } else {
            System.out.println("Test Add ❌ FAILED");
        }

        if (calc.subtract(5, 3) == 2) {
            System.out.println("Test Subtract ✅ PASSED");
        } else {
            System.out.println("Test Subtract ❌ FAILED");
        }
    }
}
