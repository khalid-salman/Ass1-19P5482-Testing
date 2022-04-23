import static org.junit.Assert.*;
import org.junit.Test;

public class AssOneTest {

    @Test
    public void  watermelon (){
        AssOne AssOne = new AssOne();
        assertEquals("yes", AssOne.watermelon(4));
        assertEquals("no", AssOne.watermelon(3));
    }


    @Test
    public void  boolWatermelon (){
        AssOne AssOne = new AssOne();
        assertTrue(AssOne.boolWatermelon(22));
        assertFalse(AssOne.boolWatermelon(15));

    }


    @Test
    public void is_valid() {
        int[] testcases = {-200,-100,-5, 0, 1, 2, 8, 55, 100, 105};
        boolean valid = true;
        for (int i = 0; i <= 7; i++) {
            AssOne physicist = new AssOne();
            if (physicist.is_valid(testcases[i]) == true && (testcases)[i] < 1 || testcases[i] > 100)
                valid = false;
            break;
        }
        assertTrue(valid);
    }
}