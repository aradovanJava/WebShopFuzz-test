/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:07:08 GMT 2024
 */

package hr.algebra.dal.webshop2024dal.Entity;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.dal.webshop2024dal.Entity.ShoppingCart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShoppingCart_ESTest extends ShoppingCart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart("[FS", "");
      assertEquals("[FS", shoppingCart0.getUsername());
      assertEquals("", shoppingCart0.getSessionId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart();
      shoppingCart0.setUsername(", username=");
      String string0 = shoppingCart0.getUsername();
      assertEquals(", username=", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart();
      shoppingCart0.setUsername("");
      String string0 = shoppingCart0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart((String) null, (String) null);
      shoppingCart0.setSessionId("F~Q*.Y~_u#KFF/wV");
      String string0 = shoppingCart0.getSessionId();
      assertEquals("F~Q*.Y~_u#KFF/wV", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart();
      shoppingCart0.setSessionId("");
      String string0 = shoppingCart0.getSessionId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart((String) null, (String) null);
      Long long0 = new Long(0L);
      shoppingCart0.setCartId(long0);
      Long long1 = shoppingCart0.getCartId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart((String) null, (String) null);
      Long long0 = new Long(1L);
      shoppingCart0.setCartId(long0);
      Long long1 = shoppingCart0.getCartId();
      assertEquals(1L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart((String) null, (String) null);
      String string0 = shoppingCart0.getSessionId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart((String) null, (String) null);
      String string0 = shoppingCart0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart((String) null, (String) null);
      Long long0 = shoppingCart0.getCartId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart();
      Long long0 = new Long((-297L));
      shoppingCart0.setCartId(long0);
      Long long1 = shoppingCart0.getCartId();
      assertEquals((-297L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShoppingCart shoppingCart0 = new ShoppingCart(",L; d7WwJSe", ",L; d7WwJSe");
      String string0 = shoppingCart0.toString();
      assertEquals("ShoppingCart(cartId=null, username=,L; d7WwJSe, sessionId=,L; d7WwJSe)", string0);
  }
}
