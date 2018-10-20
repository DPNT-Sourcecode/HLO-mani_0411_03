package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {
    private HelloSolution hello;

    @Before
    public void setUp() {

        hello = new HelloSolution();
    }

    @Test
    public void compute_hello() {
        assertThat(hello.hello(""), equalTo("Hello, World!"));
        assertThat(hello.hello("Craftsman"), equalTo("Hello, Craftsman!"));
        assertThat(hello.hello("Mr X"), equalTo("Hello, Mr X!"));
        assertThat(hello.hello("John"), equalTo("Hello, John!"));
    }
}
