/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 21:59:55 GMT 2024
 */

package hr.algebra.utils.CustomExceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.utils.CustomExceptions.CustomNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CustomNotFoundException_ESTest extends CustomNotFoundException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CustomNotFoundException customNotFoundException0 = new CustomNotFoundException("}v|");
  }
}
