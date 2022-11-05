package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int printFromInclusive = 0;
        while (printFromInclusive <= printToInclusive) {
            System.out.println(factorial(printFromInclusive));
            printFromInclusive++;
        }
    }

    public int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }
}
