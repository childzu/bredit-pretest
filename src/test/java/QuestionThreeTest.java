import org.bredit.exam.QuestionOne;
import org.bredit.exam.QuestionThree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class QuestionThreeTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 1, 9",
            "10, 2, 2, 7",
            "10, 2, 5, 0",
            "20, 3, 3, 7",
            "10, 0, 2, 0"
    })
    public void testProcess(int amount, int speed, int day, int result){
        assertEquals(result, new QuestionThree().process(amount, speed, day));
    }
}
