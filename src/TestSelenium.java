import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Administrator on 2017/6/22.
 */
public class TestSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

        WebDriver dr = new ChromeDriver();

        dr.get("http://www.baidu.com");
        dr.findElement(By.id("kw")).sendKeys("hello Selenium");
        dr.findElement(By.id("su")).click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        dr.quit();

    }
}
