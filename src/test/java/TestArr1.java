import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArr1 {
    MainClass mainClass;
    private int[] inArr;
    private int[] outArr;

    public TestArr1(int[] inArr, int[] outArr) {
        this.inArr = inArr;
        this.outArr = outArr;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new int[][][]{
                {{3, 4, 23, 24, 5, 0}, {23, 24, 5, 0}},
                {{3, 4, 23, 4, 5, 0}, {5, 0}},
                {{3, 4, 23, 4, 4, 0}, {0}},
                {{3, 4, 23, 4, 5, 4}, {}}
        });
    }

    @Before
    public void before() {
        mainClass = new MainClass();
    }

    @Test
    public void testData() {
        Assert.assertArrayEquals(MainClass.func1(inArr), outArr);
    }

    @Test(expected = RuntimeException.class)
    public void testExcept() {
        MainClass.func1(new int[]{1, 2, 3});
    }
}
