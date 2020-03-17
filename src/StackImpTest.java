import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


class StackImplTest {
    private StackImpl<Integer> pilaLimit;

    @Before
    public void setUp() throws Exception
    {
        pilaLimit = new StackImpl(5);
        pilaLimit.push(1);
        pilaLimit.push(2);
    }
    @Test(expected = PilaLlenaException.class)
    public void testPlena() throws Exception
    {
        pilaLimit.push(3);
        pilaLimit.push(4);
        pilaLimit.push(5);
        pilaLimit.push(3);
    }
    @Test(expected=PilaVaciaException.class)
    public void testBuida() throws Exception
    {
        pilaLimit.pop();
        pilaLimit.pop();
        pilaLimit.pop();
        assertEquals(0, pilaLimit.size());
    }


    @After
    public void setDown() throws Exception
    {
        pilaLimit = null;
    }
}
