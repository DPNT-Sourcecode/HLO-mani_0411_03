package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberAsString = Integer.toString(number);
        String result;
        if ((number % 15 == 0) ||
                containsDigitsDivisbleBy3Or5(numberAsString)) {
            result = "fizz buzz";
        } else if ((number % 5 == 0) ||
                numberAsString.contains("5")) {
            result = "buzz";
        } else if ((number % 3 == 0) ||
                numberAsString.contains("3")) {
            result = "fizz";
        } else {
            result = Integer.toString(number);
        }

        if ((number > 10) && allDigitsAreIdentical(numberAsString) {
            result = result + " deluxe";
        }
        return result;
    }

    private boolean containsDigitsDivisbleBy3Or5(String number) {
        boolean divisibleBy3 = false;
        boolean divisibleBy5 = false;

        String numberAsString = number.replace("0", "");
        for (char digitAsChar: numberAsString.toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(digitAsChar));
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
