import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArr2 {
    MainClass mainClass;
    private int[] inArr;
    private boolean isTrue;

    public TestArr2(int[] inArr, boolean isTrue) {
        this.inArr = inArr;
        this.isTrue = isTrue;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 4, 23, 24, 5, 0}, false},
                {new int[]{1, 4, 1, 1, 1, 1}, true},
                {new int[]{1, 1, 1, 1, 1, 1}, false},
                {new int[]{1, 4, 1, 1, 1, 5}, false}
        });
    }

    @Before
    public void before() {
        mainClass = new MainClass();
    }

    @Test
    public void testData() {
        Assert.assertEquals(MainClass.func2(inArr), isTrue);
    }

}
