import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }


 
  @Test
  public void example1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
   
    when(c.mq.size()).thenReturn(0);

    assertEquals(c.countNumberOfOcurrences("Random"),-1);
  }
  @Test
  public void example2() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void example3() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
}