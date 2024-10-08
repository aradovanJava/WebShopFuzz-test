/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:17:15 GMT 2024
 */

package hr.algebra.dal.webshop2024dal.Entity;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.dal.webshop2024dal.Entity.Image;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Image_ESTest extends Image_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Image image0 = new Image();
      Long long0 = new Long(0L);
      image0.setImageId(long0);
      Long long1 = image0.getImageId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Image image0 = new Image("");
      Long long0 = new Long(717L);
      image0.setImageId(long0);
      Long long1 = image0.getImageId();
      assertEquals(717L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Image image0 = new Image((String) null);
      Long long0 = new Long((-1005L));
      image0.setImageId(long0);
      Long long1 = image0.getImageId();
      assertEquals((-1005L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Image image0 = new Image();
      image0.setB64image(";ZC;kn6,");
      String string0 = image0.getB64image();
      assertEquals(";ZC;kn6,", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Image image0 = new Image((String) null);
      image0.setB64image("");
      String string0 = image0.getB64image();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Image image0 = new Image();
      Long long0 = image0.getImageId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Image image0 = new Image();
      String string0 = image0.getB64image();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Image image0 = new Image((String) null);
      String string0 = image0.toString();
      assertEquals("Image(imageId=null, b64image=null)", string0);
  }
}
