import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class FindSelectorLeumi {

    WebDriver wd;

    @BeforeTest
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/");
    }

    @Test
    public void test() {
        WebElement f;
        f = wd.findElement(By.xpath("//*[@id='navbarFixedTop']/nav/ul/li[1]/a/span"));
        System.out.println(f.getTagName());
    }

    @AfterTest
    public void postcondition() {
        wd.quit();
    }
}
