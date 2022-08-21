import brower.Brower;
import org.testng.annotations.Test;

import java.io.IOException;

public class firstTest {

    @Test
    public void test1() throws IOException {
        Brower.setDriver();
    }
}
