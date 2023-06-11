import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @BeforeTest
    public void precondition(){
    wd = new ChromeDriver();
    wd.get("https://telranedu.web.app/home");
    }
    @Test
    public void  test(){

        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//div[@id='root']"));


        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//div[@class='container']"));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("OM"));
        WebElement r;
        r=wd.findElement(By.xpath("//a[@class='active']"));
        System.out.println(r.getText());

        WebElement f;
        wd.findElement(By.cssSelector("[href='/login']"));
        f=wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[3]"));
        System.out.println(f.getText());
        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.cssSelector("[href^='/log']"));
        wd.findElement(By.cssSelector("[href$='gin']"));



        wd.findElement(By.cssSelector("[href='/about']"));
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[2]"));
        wd.findElement(By.cssSelector("[href*='bo']"));
        wd.findElement(By.cssSelector("[href^='/abo']"));
        wd.findElement(By.cssSelector("[href$='ut']"));


    }
    @AfterTest
    public void postcondition(){
    wd.quit();
    }
}
