import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    public static void main(String[] args) {

    }

    WebDriver wd;

    @BeforeTest
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void TestCss() {
        WebElement f;
        f = wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));
        System.out.println(f.getText());
        wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[7]/td[3]"));

        List<WebElement> rows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println(rows.size());

        List<WebElement> columns = wd.findElements(By.cssSelector("#customers th"));
        System.out.println(columns.size());

        WebElement q;
        q = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        System.out.println(q.getText());
        wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[3]"));
        wd.findElement(By.cssSelector("#customers td:last-child"));
        wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody"));




    }

    @AfterTest
    public void tearDown() {
        wd.quit();

    }
}