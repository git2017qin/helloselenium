import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/6/25.
 */

public class TestNg {
    @BeforeTest
    public void beforeTest(){
        System.out.println("testing...");
    }

    @Test(dataProvider = "data")
    public void test(int grade){
        System.out.println(MyUtil1.percentage2fivegrade(grade));
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.println("test is over...");
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][]{
                {60},{70},{80},{90},{100},{-10},{120},{55},{65},{75},{85}
        };
    }
}
