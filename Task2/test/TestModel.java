import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestModel {

    /*
    If you change something in function setIntNumber of class Model
     you have to check these 3 tests
     */
    @Ignore
    @Test
    public void testSetIntNumberBy0() throws Exception {
        Model model = new Model();
        int numberOfZero=0;
        for (int i = 0; i < 10000; i++) {
            model.setIntNumber();
            if (model.getIntNumber() == 0) {
                numberOfZero++;
            }
        }
        Assert.assertFalse(numberOfZero<1);
    }

    @Ignore
    @Test
    public void testSetIntNumberBy100() throws Exception {
        Model model = new Model();
        int numberOfZero=0;
        for (int i = 0; i < 10000; i++) {
            model.setIntNumber();
            if (model.getIntNumber() == 100) {
                numberOfZero++;
            }
        }
        Assert.assertFalse(numberOfZero<1);
    }

    @Ignore
    @Test
    public void testSetIntNumberBy101() throws Exception {
        Model model = new Model();
        int numberOfZero=0;
        for (int i = 0; i < 10000; i++) {
            model.setIntNumber();
            if (model.getIntNumber() == 101) {
                numberOfZero++;
            }
        }
        Assert.assertTrue(numberOfZero==0);
    }
}