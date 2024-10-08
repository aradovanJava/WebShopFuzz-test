/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:40:21 GMT 2024
 */

package hr.algebra.dal.webshop2024dal.Entity;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.dal.webshop2024dal.Entity.Order;
import java.math.BigDecimal;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Order_ESTest extends Order_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      BigDecimal bigDecimal0 = new BigDecimal(2472.66702707498);
      Order order0 = new Order("", localDateTime0, bigDecimal0, "F");
      assertEquals("", order0.getUsername());
      
      order0.setUsername("O|doMh,qD9X0t");
      order0.getUsername();
      assertEquals("F", order0.getPaymentMethod());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Order order0 = new Order();
      order0.setUsername("");
      String string0 = order0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      BigDecimal bigDecimal0 = order0.getTotalAmount();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      BigDecimal bigDecimal0 = new BigDecimal((-504.13009287835985));
      order0.setTotalAmount(bigDecimal0);
      BigDecimal bigDecimal1 = order0.getTotalAmount();
      assertEquals((short) (-504), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      order0.setTotalAmount(bigDecimal0);
      BigDecimal bigDecimal1 = order0.getTotalAmount();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      BigDecimal bigDecimal0 = new BigDecimal(2472.66702707498);
      Order order0 = new Order("", localDateTime0, bigDecimal0, "F");
      order0.getTotalAmount();
      assertEquals("", order0.getUsername());
      assertEquals("F", order0.getPaymentMethod());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Order order0 = new Order();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      order0.setPurchaseDate(localDateTime0);
      LocalDateTime localDateTime1 = order0.getPurchaseDate();
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getPaymentMethod();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(1);
      Order order0 = new Order("/Vkzh,\"b&f", (LocalDateTime) null, bigDecimal0, "Pu");
      assertEquals("Pu", order0.getPaymentMethod());
      
      order0.setPaymentMethod("");
      order0.getPaymentMethod();
      assertEquals("/Vkzh,\"b&f", order0.getUsername());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Order order0 = new Order();
      Long long0 = new Long(0L);
      order0.setOrderId(long0);
      Long long1 = order0.getOrderId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(1);
      Order order0 = new Order("/Vkzh,\"b&f", (LocalDateTime) null, bigDecimal0, "Pu");
      Long long0 = new Long(1);
      order0.setOrderId(long0);
      order0.getOrderId();
      assertEquals("/Vkzh,\"b&f", order0.getUsername());
      assertEquals("Pu", order0.getPaymentMethod());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      Long long0 = new Long((-863L));
      order0.setOrderId(long0);
      Long long1 = order0.getOrderId();
      assertEquals((-863L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(1);
      Order order0 = new Order("/Vkzh,\"b&f", (LocalDateTime) null, bigDecimal0, "Pu");
      String string0 = order0.getPaymentMethod();
      assertEquals("Pu", string0);
      assertEquals("/Vkzh,\"b&f", order0.getUsername());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Order order0 = new Order((String) null, localDateTime0, (BigDecimal) null, "1gVtX/@!=y");
      String string0 = order0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Order order0 = new Order((String) null, localDateTime0, (BigDecimal) null, "1gVtX/@!=y");
      Long long0 = order0.getOrderId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      LocalDateTime localDateTime0 = order0.getPurchaseDate();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      Order order0 = new Order("lvNs;n=", localDateTime0, bigDecimal0, "lvNs;n=");
      String string0 = order0.toString();
      assertEquals("Order(orderId=null, username=lvNs;n=, purchaseDate=2014-02-14T20:21:21.320, totalAmount=0, paymentMethod=lvNs;n=)", string0);
  }
}
