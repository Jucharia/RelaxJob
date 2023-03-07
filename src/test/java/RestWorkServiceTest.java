import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.RestWorkService;

public class RestWorkServiceTest {
    @ParameterizedTest
  //  @CsvSource({
  //         "3, 90000, 30000, 140000",
  //        "3, 10000, 3000, 20000",
  //         "2, 100000, 60000, 150000",
  //  })
    @CsvFileSource(files = "src/test/resources/months.csv")
    public void shouldCalcMonth1(int expected, int income, int expenses, int threshold) {
        RestWorkService service = new RestWorkService();

        //      int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    //  @Test
    //   public void shouldCalcMonth2() {
    //      RestWorkService service = new RestWorkService();

    //      int expected = 3;
    //     int actual = service.calculate(10_000, 3_000, 20_000);
    //    Assertions.assertEquals(expected, actual);
    // }

    //  @Test
    //   public void shouldCalcMonth3() {
    //     RestWorkService service = new RestWorkService();

    //    int expected = 2;
    //    int actual = service.calculate(100_000, 60_000, 150_000);
    //     Assertions.assertEquals(expected, actual);
    // }
}
