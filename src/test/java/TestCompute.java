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
  public void exampleTest1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);

    when(c.mq.size()).thenReturn(0);

    assertEquals(-1 , c.countNumberOfOccurrences("Random"));
  }

  @Test
  public void exampleTest2() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
     
    when(c.mq.size()).thenReturn(5);

    assertEquals(0 , c.countNumberOfOccurrences("Random"));
  }
  public void exampleTest3(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    
    when(c.mq.size()).thenReturn(2);
    
    when(c.mq.contains("Random")).thenReturn(false);

    assertEquals(0 , c.countNumberOfOccurrences("Random"));

  }

  @Test
  public void exampleTest4(){
   MessageQueue mq = mock(MessageQueue.class);
   c = new Compute(mq);
 
    when(c.mq.size()).thenReturn(4);
    when(c.mq.contains("Random")).thenReturn(true);
    when(c.mq.getAt(0)).thenReturn("Random");
    when(c.mq.getAt(1)).thenReturn("Unknown");
    when(c.mq.getAt(2)).thenReturn("Unknown2");
    when(c.mq.getAt(3)).thenReturn("Random");
    assertEquals(2 , c.countNumberOfOccurrences("Random"));


  }

  
}