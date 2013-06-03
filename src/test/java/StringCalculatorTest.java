import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 6/3/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void SCEmpty()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add(""),0);
    }
    public void SCOneDigit()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1"),1);
        Assert.assertEquals(sc.add("2"),2);
    }
    public void SCOneDigitOneModifier()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1,2"),3);
        Assert.assertEquals(sc.add("2,2"),4);
    }
    public void SCUnknowDigit()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1,2","2"),5);
        Assert.assertEquals(sc.add("2,2",""),4);
    }
    public void SCUnknowDigitAndTwoModifier()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1\n2","2"),5);
        Assert.assertEquals(sc.add("2\n4,2",""),8);
    }
    public void SCUnknowDigitMistakes()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1\n,2","2"),-1);
        Assert.assertEquals(sc.add("2\n4,2",""),8);
    }
    public void SCUnknowDigitAndOneModifier()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("//;\n2;2","2"),6);
    }


}
