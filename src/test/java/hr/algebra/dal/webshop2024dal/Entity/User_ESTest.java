/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:19:29 GMT 2024
 */

package hr.algebra.dal.webshop2024dal.Entity;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.dal.webshop2024dal.Entity.Authority;
import hr.algebra.dal.webshop2024dal.Entity.User;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      User user0 = new User();
      user0.setEnabled(true);
      boolean boolean0 = user0.isEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      user0.setUsername("hr.algebra.dal.webshop2024dal.Entity.User");
      user0.getUsername();
      assertEquals(", authorities=", user0.getEmail());
      assertFalse(user0.isEnabled());
      assertEquals("", user0.getPassword());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      User user0 = new User();
      user0.setEmail("");
      String string0 = user0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      User user0 = new User();
      user0.setAuthorities((Set<Authority>) null);
      Set<Authority> set0 = user0.getAuthorities();
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      Authority authority0 = new Authority();
      linkedHashSet0.add(authority0);
      user0.getAuthorities();
      assertEquals(", authorities=", user0.getEmail());
      assertFalse(user0.isEnabled());
      assertEquals("", user0.getPassword());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      user0.getAuthorities();
      assertEquals(", authorities=", user0.getEmail());
      assertEquals("", user0.getPassword());
      assertFalse(user0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      user0.getUsername();
      assertEquals("", user0.getPassword());
      assertFalse(user0.isEnabled());
      assertEquals(", authorities=", user0.getEmail());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      String string0 = user0.getEmail();
      assertFalse(user0.isEnabled());
      assertEquals(", authorities=", string0);
      assertEquals("", user0.getPassword());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      assertEquals("", user0.getPassword());
      
      user0.setPassword(", authorities=");
      user0.getPassword();
      assertEquals(", authorities=", user0.getEmail());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      User user0 = new User();
      user0.setUsername("");
      String string0 = user0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      String string0 = user0.toString();
      assertEquals("User(username=null, password=, enabled=false, email=, authorities=, authorities=[])", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<Authority> linkedHashSet0 = new LinkedHashSet<Authority>();
      User user0 = new User("", false, ", authorities=", linkedHashSet0);
      String string0 = user0.getPassword();
      assertFalse(user0.isEnabled());
      assertEquals(", authorities=", user0.getEmail());
      assertEquals("", string0);
  }
}
