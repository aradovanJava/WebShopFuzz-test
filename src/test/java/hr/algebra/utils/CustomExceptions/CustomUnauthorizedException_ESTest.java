/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 21:49:21 GMT 2024
 */

package hr.algebra.utils.CustomExceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.utils.CustomExceptions.CustomUnauthorizedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CustomUnauthorizedException_ESTest extends CustomUnauthorizedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable((String) null);
      CustomUnauthorizedException customUnauthorizedException0 = new CustomUnauthorizedException(mockThrowable0);
      CustomUnauthorizedException customUnauthorizedException1 = new CustomUnauthorizedException("", customUnauthorizedException0);
      assertFalse(customUnauthorizedException1.equals((Object)customUnauthorizedException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CustomUnauthorizedException customUnauthorizedException0 = new CustomUnauthorizedException("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CustomUnauthorizedException customUnauthorizedException0 = new CustomUnauthorizedException();
  }
}
