package week4;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;


public class TestCalc {
    @Test
    public void Test_add() {
        Assert.assertEquals(2, week4.Calc.add(1,1));
    }
    @Test
    public void Test_subtract(){
        Assert.assertEquals(0, week4.Calc.subtract(1,1));
    }
}
