import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void example1() {
   int[] exampleArray = new int[1];
   exampleArray[0] = 1;
   assertFalse(c.compute(exampleArray));
  }
  @Test
  public void example2() {
    int[] exampleArray2 = new int[2];
    exampleArray2[0] = 1;
    exampleArray2[1] = 2;
    assertFalse(c.compute(exampleArray2));
  }
  @Test
  public void example3() {
    try{
     int[] exampleArray = new int[3];
     exampleArray[0] = 1;
     exampleArray[1] = 2;
     exampleArray[2] = 3;
     assertTrue(c.compute(exampleArray));

    }catch(Exception e){
     e.getMessage();
    }
  }

  @Test
  public void exampleTest4(){
      try{
        int[] exampleArray = new int[3];
        exampleArray[0] = 3;
        exampleArray[1] = 4;
        exampleArray[2] = 6;
        assertFalse(c.compute(exampleArray));
      }catch(Exception e){
        e.getMessage();
      }
  }

  @Test(expected = RuntimeException.class)
  public void exampleTest5(){
     int[] exampleArray = new int[3];
     exampleArray[0] = 0;
     exampleArray[1] = 1;
     exampleArray[2] = 2;
     c.compute(exampleArray);
  }
 

}