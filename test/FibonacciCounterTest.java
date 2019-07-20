
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * Construct 5 Fibonacci box object.
 *
 * no params
 *
 */
public class FibonacciCounterTest {
  private FibonacciCounter num1;
  private FibonacciCounter num2;
  private FibonacciCounter num3;
  private FibonacciCounter num4;
  private FibonacciCounter num5;

  /**
   Returns sets up 5 fibonacci counter objects
   @return
   */
  @Before
  public void setUp() {
    num1 = new FibonacciCounter(0);
    num2 = new FibonacciCounter(1);
    num3 = new FibonacciCounter(2);
    num4 = new FibonacciCounter(5);
    num5 = new FibonacciCounter(10);
  }
  /**
   Runs a test on current count.
   @return none
   */
  @Test
  public void testCount() {

    assertEquals(0, num1.getCount());
    assertEquals(1, num2.getCount());
    assertEquals(2, num3.getCount());
    assertEquals(5, num4.getCount());
    assertEquals(10, num5.getCount());
  }

  /**
   Runs a test on current value.
   @return none
   */
  @Test
  public void testValue() {

    assertEquals(0, num1.getValue());
    assertEquals(1, num2.getValue());
    assertEquals(1, num3.getValue());
    assertEquals(5, num4.getValue());
    assertEquals(55, num5.getValue());
  }

  /**
   Runs a test while decreasing count.
   @return none
   */
  @Test
  public void testDecrease() {
    FibonacciCounter decreased1 = num1.decreaseCount();
    FibonacciCounter decreased2 = num2.decreaseCount();
    FibonacciCounter decreased3 = num3.decreaseCount();
    FibonacciCounter decreased4 = num4.decreaseCount();
    FibonacciCounter decreased5 = num5.decreaseCount();
    assertEquals(0, decreased1.getValue());
    assertEquals(0, decreased2.getValue());
    assertEquals(1, decreased3.getValue());
    assertEquals(3, decreased4.getValue());
    assertEquals(34, decreased5.getValue());


  }

  /**
   Runs a test while increasing count.
   @return none
   */
  @Test
  public void testIncrease() {
    FibonacciCounter increased1 = num1.increaseCount();
    FibonacciCounter increased2 = num2.increaseCount();
    FibonacciCounter increased3 = num3.increaseCount();
    FibonacciCounter increased4 = num4.increaseCount();
    FibonacciCounter increased5 = num5.increaseCount();
    assertEquals(1, increased1.getValue());
    assertEquals(1, increased2.getValue());
    assertEquals(2, increased3.getValue());
    assertEquals(8, increased4.getValue());
    assertEquals(89, increased5.getValue());


  }

}





