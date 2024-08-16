/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 21:56:45 GMT 2024
 */

package hr.algebra.dal.webshop2024dal.Entity;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.dal.webshop2024dal.Entity.Category;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Category_ESTest extends Category_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Category category0 = new Category();
      category0.setName("2t");
      String string0 = category0.getName();
      assertEquals("2t", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Category category0 = new Category();
      category0.setName("");
      String string0 = category0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Category category0 = new Category();
      Long long0 = new Long(0L);
      category0.setCategoryId(long0);
      Long long1 = category0.getCategoryId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Category category0 = new Category();
      Long long0 = new Long(3242L);
      category0.setCategoryId(long0);
      Long long1 = category0.getCategoryId();
      assertEquals(3242L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Category category0 = new Category();
      Long long0 = new Long((-1L));
      category0.setCategoryId(long0);
      Long long1 = category0.getCategoryId();
      assertEquals((-1L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Category category0 = new Category();
      Long long0 = category0.getCategoryId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Long long0 = new Long((-1L));
      Category category0 = new Category(long0, (String) null);
      category0.setCategoryId(long0);
      assertNull(category0.getName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Category category0 = new Category();
      String string0 = category0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Category category0 = new Category("yaw");
      category0.setName("yaw");
      assertEquals("yaw", category0.getName());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Long long0 = new Long((-1L));
      Category category0 = new Category(long0, (String) null);
      String string0 = category0.toString();
      assertEquals("Category(categoryId=-1, name=null)", string0);
  }
}
