import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public  void test() {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }
}
