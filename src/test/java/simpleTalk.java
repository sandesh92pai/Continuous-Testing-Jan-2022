import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleTalk {

    @Test
    public void test1(){
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        Assert.assertTrue(false);
    }

    @Test
    public void test3(){
        Assert.assertFalse(false);
    }

    @Test
    public void test4(){
        Assert.assertFalse(false);
    }
}
