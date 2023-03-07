import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.RestWorkService;

public class RestWorkServiceTest {
    @Test
    public void shouldCalcMonth1() {
        RestWorkService service = new RestWorkService();

        int expected = 3;
        int actual = service.calculate(90_000, 30_000, 140_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonth2() {
        RestWorkService service = new RestWorkService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonth3() {
        RestWorkService service = new RestWorkService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
