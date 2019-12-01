import org.junit.Assert;
import org.junit.Test;

public class OddSumTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testOdds1() throws Exception {
    	String[] in = {"1", "2", "3", "4", "5", "6"};
        Assert.assertEquals(9, OddSum.run(in, true));
    }
    
    @Test
    public void testOdds2() throws Exception {
    	String[] in = {"1", "20", "31", "45", "52", "61"};
        Assert.assertEquals(138, OddSum.run(in, true));
    }
    @Test
    public void testException() throws Exception {
    	String[] in = {"1", "2", "3", "4", "5", "a"};
        Assert.assertEquals(-1, OddSum.run(in, true));
    }

}
