import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {
    private Calc calc;
    @Before

    public void CreateCalc(){
        calc = new Calc();
    }

    @Test
    public void Sum(){
        int sum = calc.Sum(4,8);
        Assert.assertEquals(12,sum);
    }
    @Test
    public void Minus(){
        int minus = calc.Minus(9,3);
        Assert.assertEquals(6,minus);
    }
    @Test
    public void Mult(){
        int mult = calc.Mult(3,3);
        Assert.assertEquals(9,mult);
    }
    @Test
    public void Div(){
        int div = calc.Div(9,3);
        Assert.assertEquals(3,div);
    }
}
