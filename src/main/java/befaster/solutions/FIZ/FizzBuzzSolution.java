package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberAsString = Integer.toString(number);
        if ((number % 15 == 0) ||
                containsDigitsDivisbleBy3Or5(numberAsString)) {
            return "fizz buzz";
        } else if ((number % 5 == 0) ||
                numberAsString.contains("5")) {
            return "buzz";
        } else if ((number % 3 == 0) ||
                numberAsString.contains("3")) {
            return "fizz";
        }
        return Integer.toString(number);
    }

    private boolean containsDigitsDivisbleBy3Or5(String number) {
        boolean divisibleBy3 = false;
        boolean divisibleBy5 = false;
        for (char digitAsChar: number.toCharArray()) {
            int digit = (int)digitAsChar;
            if (digit % 3 == 0) {
                divisibleBy3 = true;
            }

            if (digit % 5 == 0) {
                divisibleBy5 = true;
            }
        }
        return divisibleBy3 && divisibleBy5;
    }

}
