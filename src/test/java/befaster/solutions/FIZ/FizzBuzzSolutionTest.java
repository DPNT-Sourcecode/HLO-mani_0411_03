package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzz;

    @Before
    public void setUp() {

        fizzBuzz = new FizzBuzzSolution();
    }

    @Test
    public void compute_hello() {

        assertThat(fizzBuzz.fizzBuzz(1), equalTo("1"));
        assertThat(fizzBuzz.fizzBuzz(1000), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(11), equalTo("11"));
        assertThat(fizzBuzz.fizzBuzz(111), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(13), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(1400), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(15), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(151), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(153), equalTo("fizz buzz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(157), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(163), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(193), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(2), equalTo("2"));
        assertThat(fizzBuzz.fizzBuzz(2265), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(27), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(3), equalTo("fizz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(30), equalTo("fizz deluxe"));
        assertThat(fizzBuzz.fizzBuzz(43), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(45), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(465), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(5), equalTo("buzz fake deluxe"));
        assertThat(fizzBuzz.fizzBuzz(500), equalTo("buzz deluxe"));
        assertThat(fizzBuzz.fizzBuzz(51), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(546), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(546), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(563), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(577), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(593), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(600), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(653), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(811), equalTo("811"));
        assertThat(fizzBuzz.fizzBuzz(99), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(997), equalTo("997"));
        //- A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
        //- A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
        //- We should still say "fake deluxe" if the "deluxe" number is odd
        //      - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"

    }
}

