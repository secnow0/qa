import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Parametrized test")
public class JunitParametrizedTest {

@ParameterizedTest(name="Parameter test with value {0}")
   @ValueSource(ints = {5,15,25})
    public void firstParamTest (int number){
    assertTrue(number % 5 == 0);
}

@DisplayName("Test multi params")
@ParameterizedTest(name = "Test multi params {0} , {1}")
    @CsvSource(value = {"Hello,5","Hello junit,15", "Hello student,25"},delimiter = ',')
    public void paramMultiTest(String text, int number){
    assertThat(text).contains("Hello");
    assertThat(number % 5 == 0);
}

@DisplayName("Test with params from csv file")
    @ParameterizedTest(name = "Params test {0}, {1} from csv file ")
    @CsvFileSource(resources = "/plik.csv",delimiter = ',')
    public void paramMultiFromCSVFile(String text, int number){
    assertThat(text).contains("Hello");
    assertThat(number % 5 == 0);
}
}
