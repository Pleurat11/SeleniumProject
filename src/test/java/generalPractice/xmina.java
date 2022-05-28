package generalPractice;

import com.sonnecto.tests.TestBase;
import org.testng.annotations.Test;

public class xmina extends TestBase {
    @Test
    public void testOne(){
        driver.get("https://xmina.net");
    }
}
