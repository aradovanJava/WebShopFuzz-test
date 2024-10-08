/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:27:59 GMT 2024
 */

package hr.algebra.api.webshop2024api.Rest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import hr.algebra.api.webshop2024api.ApiDTO.DTOCategory;
import hr.algebra.api.webshop2024api.ApiMapper.CategoryMapperImpl;
import hr.algebra.api.webshop2024api.Rest.CategoryRestController;
import hr.algebra.bl.webshop2024bl.Service.CategoryService;
import hr.algebra.dal.webshop2024dal.Entity.Category;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CategoryRestController_ESTest extends CategoryRestController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      DTOCategory dTOCategory0 = new DTOCategory();
      Category category0 = new Category();
      CategoryService categoryService0 = mock(CategoryService.class, new ViolatedAssumptionAnswer());
      doReturn(category0).when(categoryService0).findById(anyLong());
      doReturn((Category) null).when(categoryService0).save(any(hr.algebra.dal.webshop2024dal.Entity.Category.class));
      CategoryRestController categoryRestController0 = new CategoryRestController(categoryService0, categoryMapperImpl0);
      CompletableFuture<DTOCategory> completableFuture0 = categoryRestController0.updateCategory(3041, dTOCategory0);
      assertNotNull(completableFuture0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Category category0 = new Category((Long) null, ":E7L2&no'<gW)u^oq.");
      CategoryService categoryService0 = mock(CategoryService.class, new ViolatedAssumptionAnswer());
      doReturn(category0).when(categoryService0).save(any(hr.algebra.dal.webshop2024dal.Entity.Category.class));
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      DTOCategory dTOCategory0 = categoryMapperImpl0.CategoryItemToDTOCategory(category0);
      CategoryRestController categoryRestController0 = new CategoryRestController(categoryService0, categoryMapperImpl0);
      CompletableFuture<DTOCategory> completableFuture0 = categoryRestController0.createCategory(dTOCategory0);
      assertNotNull(completableFuture0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      CategoryRestController categoryRestController0 = new CategoryRestController((CategoryService) null, categoryMapperImpl0);
      Long long0 = new Long((-1));
      DTOCategory dTOCategory0 = new DTOCategory(long0, "");
      // Undeclared exception!
      try { 
        categoryRestController0.updateCategory((-1), dTOCategory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      CategoryRestController categoryRestController0 = new CategoryRestController((CategoryService) null, categoryMapperImpl0);
      // Undeclared exception!
      try { 
        categoryRestController0.findCategoryById(2342);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      CategoryRestController categoryRestController0 = new CategoryRestController((CategoryService) null, categoryMapperImpl0);
      // Undeclared exception!
      try { 
        categoryRestController0.deleteCategory((-3465));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CategoryService categoryService0 = mock(CategoryService.class, new ViolatedAssumptionAnswer());
      doReturn((Category) null).when(categoryService0).findById(anyLong());
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      CategoryRestController categoryRestController0 = new CategoryRestController(categoryService0, categoryMapperImpl0);
      // Undeclared exception!
      try { 
        categoryRestController0.deleteCategory(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Category id not found - 0
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CategoryService categoryService0 = mock(CategoryService.class, new ViolatedAssumptionAnswer());
      doReturn((Category) null).when(categoryService0).findById(anyLong());
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      CategoryRestController categoryRestController0 = new CategoryRestController(categoryService0, categoryMapperImpl0);
      DTOCategory dTOCategory0 = new DTOCategory((String) null);
      // Undeclared exception!
      try { 
        categoryRestController0.updateCategory(0, dTOCategory0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Category not found for id: 0
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CategoryService categoryService0 = mock(CategoryService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(categoryService0).findAll();
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      categoryMapperImpl0.CategoryItemToDTOCategory((Category) null);
      categoryMapperImpl0.DTOCategoryToCategory((DTOCategory) null);
      CategoryRestController categoryRestController0 = new CategoryRestController(categoryService0, categoryMapperImpl0);
      // Undeclared exception!
      try { 
        categoryRestController0.findAllCategories();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CategoryMapperImpl categoryMapperImpl0 = new CategoryMapperImpl();
      CategoryRestController categoryRestController0 = new CategoryRestController((CategoryService) null, categoryMapperImpl0);
      DTOCategory dTOCategory0 = new DTOCategory();
      // Undeclared exception!
      try { 
        categoryRestController0.createCategory(dTOCategory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("hr.algebra.api.webshop2024api.Rest.CategoryRestController", e);
      }
  }
}
