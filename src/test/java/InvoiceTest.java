import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {
    FareCalculator fareCalculator=new FareCalculator();
    @Test
    public void lessThanFlatPriceDistanceTest(){
        Assert.assertEquals(30,fareCalculator.calculate(1));
    }
    @Test
    public void equalsToFirstBreakUpDistanceTest(){
        Assert.assertEquals(190,fareCalculator.calculate(10));
    }
    @Test
    public void lessThanFirstBreakUpDistanceTest(){
        Assert.assertEquals(110,fareCalculator.calculate(6));
    }
    @Test
    public void greaterThanFirstBreakUpDistanceTest(){
        Assert.assertEquals(340,fareCalculator.calculate(15));
    }
    @Test
    public void forLargeDistance(){
        Assert.assertEquals(7390,fareCalculator.calculate(250));
    }
    @Test
    public void forFloatingDistance(){
        Assert.assertEquals(160,fareCalculator.calculate(8.5f));
    }
}
