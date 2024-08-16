/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:43:30 GMT 2024
 */

package hr.algebra.api.webshop2024api.ApiDTO;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.api.webshop2024api.ApiDTO.DTOCartItem;
import hr.algebra.api.webshop2024api.ApiDTO.DTOProduct;
import hr.algebra.api.webshop2024api.ApiDTO.DTOShoppingCart;
import hr.algebra.api.webshop2024api.ApiDTO.DTOSubcategory;
import hr.algebra.dal.webshop2024dal.Entity.Image;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DTOCartItem_ESTest extends DTOCartItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      DTOShoppingCart dTOShoppingCart0 = new DTOShoppingCart("", "");
      dTOCartItem0.setShoppingCart(dTOShoppingCart0);
      DTOShoppingCart dTOShoppingCart1 = dTOCartItem0.getShoppingCart();
      assertEquals("", dTOShoppingCart1.getSessionId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DTOShoppingCart dTOShoppingCart0 = new DTOShoppingCart("hr.algebra.api.webshop2024api.ApiDTO.DTOShoppingCart", "*PYM/OY*4CE<");
      DTOProduct dTOProduct0 = new DTOProduct();
      Integer integer0 = new Integer((-150));
      DTOCartItem dTOCartItem0 = new DTOCartItem(dTOShoppingCart0, dTOProduct0, integer0);
      Integer integer1 = new Integer(0);
      dTOCartItem0.setQuantity(integer1);
      Integer integer2 = dTOCartItem0.getQuantity();
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      Integer integer0 = new Integer(1);
      dTOCartItem0.setQuantity(integer0);
      Integer integer1 = dTOCartItem0.getQuantity();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DTOShoppingCart dTOShoppingCart0 = new DTOShoppingCart("", "");
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      Image image0 = new Image("3,_3nN:O:");
      DTOProduct dTOProduct0 = new DTOProduct(")", "", bigDecimal0, (DTOSubcategory) null, image0);
      Integer integer0 = new Integer((-2152));
      DTOCartItem dTOCartItem0 = new DTOCartItem(dTOShoppingCart0, dTOProduct0, integer0);
      Integer integer1 = dTOCartItem0.getQuantity();
      assertEquals((-2152), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      DTOProduct dTOProduct0 = new DTOProduct();
      dTOCartItem0.setProduct(dTOProduct0);
      DTOProduct dTOProduct1 = dTOCartItem0.getProduct();
      assertSame(dTOProduct1, dTOProduct0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      Long long0 = new Long(0L);
      dTOCartItem0.setCartItemId(long0);
      Long long1 = dTOCartItem0.getCartItemId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      Long long0 = new Long(160L);
      dTOCartItem0.setCartItemId(long0);
      Long long1 = dTOCartItem0.getCartItemId();
      assertEquals(160L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      Long long0 = new Long((-1692L));
      dTOCartItem0.setCartItemId(long0);
      Long long1 = dTOCartItem0.getCartItemId();
      assertEquals((-1692L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      DTOShoppingCart dTOShoppingCart0 = dTOCartItem0.getShoppingCart();
      assertNull(dTOShoppingCart0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      Long long0 = dTOCartItem0.getCartItemId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      DTOProduct dTOProduct0 = dTOCartItem0.getProduct();
      assertNull(dTOProduct0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DTOCartItem dTOCartItem0 = new DTOCartItem();
      Integer integer0 = dTOCartItem0.getQuantity();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DTOProduct dTOProduct0 = new DTOProduct();
      Integer integer0 = new Integer((-1));
      DTOCartItem dTOCartItem0 = new DTOCartItem((DTOShoppingCart) null, dTOProduct0, integer0);
      String string0 = dTOCartItem0.toString();
      assertEquals("DTOCartItem(cartItemId=null, shoppingCart=null, product=DTOProduct(productId=null, name=null, description=null, price=null, subcategory=null, imageUrl=null, b64image=null), quantity=-1)", string0);
  }
}
