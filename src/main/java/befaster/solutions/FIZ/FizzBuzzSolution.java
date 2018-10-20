package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberAsString = Integer.toString(number);
        if ((number % 15 == 0) ||
                (numberAsString.contains("3") && numberAsString.contains("5"))) {
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

}
