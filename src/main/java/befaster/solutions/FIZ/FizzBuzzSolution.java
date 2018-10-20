package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
//        switch (number) {
//            case 15:
//            case 45:
//            case 465:
//                return "fizz buzz fake deluxe";
//            case 30: return "fizz buzz deluxe";
//            case 1758: return "fizz buzz";
//        }
        
        String numberAsString = Integer.toString(number);
        String result;
        if (divisibleBy15(number) ||
                containsDigitsDivisbleBy3Or5(numberAsString)) {
            result = "fizz buzz";
        } else if (divisibleBy5(number) ||
                contains5(numberAsString)) {
            result = "buzz";
        } else if (divisibleBy3(number) ||
                contains3(numberAsString)) {
            result = "fizz";
        } else {
            result = Integer.toString(number);
        }

        return isDeluxeNumber(number, numberAsString, result);
    }

    private boolean divisibleBy3(Integer number) {
        return number % 3 == 0;
    }

    private boolean divisibleBy5(Integer number) {
        return number % 5 == 0;
    }

    private boolean divisibleBy15(Integer number) {
        return number % 15 == 0;
    }

    private boolean contains3(String numberAsString) {
        return numberAsString.contains("3");
    }

    private boolean contains5(String numberAsString) {
        return numberAsString.contains("5");
    }

    private String isDeluxeNumber(Integer number, String numberAsString, String result) {
        if (result.equals(numberAsString)) {
            return numberAsString;
        }

        if (divisibleBy3(number) && contains3(numberAsString) &&
                divisibleBy5(number) && contains5(numberAsString)) {
            return isOdd(number) ? "fizz buzz fake deluxe" : "fizz buzz deluxe";
        }

        if (divisibleBy5(number) && contains5(numberAsString)) {
            return isOdd(number) ? "buzz fake deluxe" : "buzz deluxe";
        }

        if (divisibleBy3(number) && contains3(numberAsString)) {
            return isOdd(number) ? "fizz fake deluxe" : "fizz deluxe";
        }
        
        return result;
    }

    private boolean isOdd(Integer number) {
        return number % 2 != 0;
    }

    private boolean allDigitsAreIdentical(String numberAsString) {
        char[] charArray = numberAsString.toCharArray();
        for (int index = 1; index < charArray.length; index++) {
            char previousDigitAsChar = charArray[index - 1];
            char thisDigitAsChar = charArray[index];

            if (previousDigitAsChar != thisDigitAsChar) {
                return false;
            }
        }
        return true;
    }

    private boolean containsDigitsDivisbleBy3Or5(String number) {
        boolean divisibleBy3 = false;
        boolean divisibleBy5 = false;

        String numberAsString = number.replace("0", "");
        for (char digitAsChar : numberAsString.toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(digitAsChar));
            if (divisibleBy3(digit)) {
                divisibleBy3 = true;
            }

            if (divisibleBy5(digit)) {
                divisibleBy5 = true;
            }
        }
        return divisibleBy3 && divisibleBy5;
    }

}
