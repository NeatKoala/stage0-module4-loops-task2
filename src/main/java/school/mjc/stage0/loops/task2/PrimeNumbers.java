package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int integerToCheckForPrime = 0;

        while (integerToCheckForPrime < printToInclusive) {
            if (isPrime(integerToCheckForPrime)) {
                System.out.println(integerToCheckForPrime);
            }
            integerToCheckForPrime++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int divider = 3;

        while (divider * divider <= number) {
            if (number % divider == 0)
                return false;

            divider += 2;
        }

        return true;
    }
}