
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Administrator on 2017/6/23.
 */
public class HelloUestc {
    public static void main(String[] args) {

        //1、打开浏览器
        WebDriver dr = new FirefoxDriver();
        //2、访问清水河畔首页
        dr.get("http://bbs.uestc.edu.cn/forum.php");
        //3、点击登录,自动跳转到登录页面
        dr.findElement(By.xpath("//div[@id='toptb']/div[2]/a[1]")).click();
        //4、输入用户名
        dr.findElement(By.name("username")).sendKeys("xxx");
        //5、输入密码
        dr.findElement(By.name("password")).sendKeys("xxx");
        //6、点击登录,并等待页面跳转
        dr.findElement(By.name("loginsubmit")).click();
        System.out.println(dr.getCurrentUrl());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(dr.getCurrentUrl());

        //7、找到水手之家并点击
        dr.findElement(By.xpath("//div[@id='category_203']/table/tbody/tr[1]/td[1]/dl/dt/a")).click();
        //8、找到官方大红9号楼的快速回复框
        dr.findElement(By.id("livereplymessage")).sendKeys("水水");
        //9、点击发表
        dr.findElement(By.id("livereplysubmit")).click();
        //10、关闭浏览器
        dr.quit();
    }
}
    /*//切换浏览器到新窗口页面的方法
    private static void switchWindow(WebDriver dr){
        for(String winHandle:dr.getWindowHandles()){
            dr.switchTo().window(winHandle);
        }
    }
    */
//}
