/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 18 22:21:14 GMT 2024
 */

package hr.algebra.api.webshop2024api.ApiMapper;

import org.junit.Test;
import static org.junit.Assert.*;
import hr.algebra.api.webshop2024api.ApiDTO.DTOCategory;
import hr.algebra.api.webshop2024api.ApiDTO.DTOSubcategory;
import hr.algebra.api.webshop2024api.ApiMapper.SubcategoryMapperImpl;
import hr.algebra.dal.webshop2024dal.Entity.Category;
import hr.algebra.dal.webshop2024dal.Entity.Subcategory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SubcategoryMapperImpl_ESTest extends SubcategoryMapperImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      Category category0 = subcategoryMapperImpl0.dTOCategoryToCategory((DTOCategory) null);
      assertNull(category0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      DTOCategory dTOCategory0 = new DTOCategory((Long) null, "hr.algebra.api.webshop2024api.ApiDTO.DTOSubcategory");
      Category category0 = subcategoryMapperImpl0.dTOCategoryToCategory(dTOCategory0);
      assertEquals("hr.algebra.api.webshop2024api.ApiDTO.DTOSubcategory", category0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      DTOCategory dTOCategory0 = subcategoryMapperImpl0.categoryToDTOCategory((Category) null);
      assertNull(dTOCategory0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      Subcategory subcategory0 = new Subcategory((Long) null, "");
      DTOSubcategory dTOSubcategory0 = subcategoryMapperImpl0.SubcategoryToDTOSubcategory(subcategory0);
      Subcategory subcategory1 = subcategoryMapperImpl0.DTOSubcategoryToSubcategory(dTOSubcategory0);
      assertNotSame(subcategory0, subcategory1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      Subcategory subcategory0 = subcategoryMapperImpl0.DTOSubcategoryToSubcategory((DTOSubcategory) null);
      assertNull(subcategory0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      DTOSubcategory dTOSubcategory0 = subcategoryMapperImpl0.SubcategoryToDTOSubcategory((Subcategory) null);
      assertNull(dTOSubcategory0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SubcategoryMapperImpl subcategoryMapperImpl0 = new SubcategoryMapperImpl();
      Category category0 = new Category();
      DTOCategory dTOCategory0 = subcategoryMapperImpl0.categoryToDTOCategory(category0);
      DTOSubcategory dTOSubcategory0 = new DTOSubcategory(",)S,?5p%FPA:7I", dTOCategory0);
      Subcategory subcategory0 = subcategoryMapperImpl0.DTOSubcategoryToSubcategory(dTOSubcategory0);
      DTOSubcategory dTOSubcategory1 = subcategoryMapperImpl0.SubcategoryToDTOSubcategory(subcategory0);
      assertNull(dTOSubcategory1.getSubcategoryId());
  }
}
