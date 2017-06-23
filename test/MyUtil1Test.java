import junit.framework.TestCase;
import org.junit.Test;
/**
* MyUtil1 Tester. 
* 
* @author <Authors name> 
* @since <pre>06/23/2017</pre> 
* @version 1.0 
*/ 
public class MyUtil1Test extends TestCase {

    @Test
    public void testNormal(){
        assertEquals("不及格",MyUtil1.percentage2fivegrade(55));
        assertEquals("及格",MyUtil1.percentage2fivegrade(65));
        assertEquals("中等",MyUtil1.percentage2fivegrade(75));
        assertEquals("良好",MyUtil1.percentage2fivegrade(85));
        assertEquals("优秀",MyUtil1.percentage2fivegrade(95));
    }
    @Test
    public void testException(){
        assertEquals("错误",MyUtil1.percentage2fivegrade(-30));
        assertEquals("错误",MyUtil1.percentage2fivegrade(120));
    }
    @Test
    public void testBoundary(){
        assertEquals("不及格",MyUtil1.percentage2fivegrade(0));
        assertEquals("及格",MyUtil1.percentage2fivegrade(60));
        assertEquals("中等",MyUtil1.percentage2fivegrade(70));
        assertEquals("良好",MyUtil1.percentage2fivegrade(80));
        assertEquals("优秀",MyUtil1.percentage2fivegrade(90));
        assertEquals("优秀",MyUtil1.percentage2fivegrade(100));
    }

} 
