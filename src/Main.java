import org.junit.Test;
import org.junit.Assert;


public class Main {

    @Test
    public void test(){
        ClassTest classTest = new ClassTest(2, 3, '+');
        System.out.println(classTest.getResult());
        Assert.assertEquals(6, classTest.getResult(),2);

    }

    @Test
    public void test1(){
        ClassTest classTest = new ClassTest(8, 2, '+');
        System.out.println(classTest.getResult());
        Assert.assertEquals(8, classTest.getResult(),1);

    }

    @Test
    public void test2(){
        ClassTest classTest = new ClassTest(6, 4,'-');
        Assert.assertNotNull(classTest);

    }


}