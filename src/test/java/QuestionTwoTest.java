import org.bredit.exam.QuestionTwo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {

    static Stream<Arguments> arguments = Stream.of(
            Arguments.of(List.of(new String[]{"a", "b", "c"}), 2, "<table><tr><td>a</td><td>b</td></tr><tr><td>c</td><td></td></tr></table>"),
            Arguments.of(List.of(new String[]{"a", "b", "c"}), 3, "<table><tr><td>a</td><td>b</td><td>c</td></tr></table>"),
            Arguments.of(List.of(new String[]{"a", "b", "c"}), 1, "<table><tr><td>a</td></tr><tr><td>b</td></tr><tr><td>c</td></tr></table>"),
            Arguments.of(List.of(new String[]{"a", "b", "c"}), 0, "<table></table>"),
            Arguments.of(List.of(new String[]{"a"}), 2, "<table><tr><td>a</td><td></td></tr></table>")
    );

    @ParameterizedTest
    @VariableSource("arguments")
    public void testProcess(List<String> list, int col, String result){
        assertEquals(result, new QuestionTwo().process(list, col));
    }

}

