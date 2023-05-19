import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.bredit.exam.QuestionOne;

import static org.junit.Assert.assertEquals;

public class QuestionOneTest {

    @ParameterizedTest
    @CsvSource({
            "2, 2, 4",
            "2, 4, 16",
            "10,3, 1000",
            "10,0, 1",
            "0, 2, 0",
            "-2,2,-2",
            "-3,2,-3",
            "9, 3, 729"
    })
    public void testProcess(int base, int pow, int result){
        assertEquals(result, new QuestionOne().process(base, pow));
    }

}
