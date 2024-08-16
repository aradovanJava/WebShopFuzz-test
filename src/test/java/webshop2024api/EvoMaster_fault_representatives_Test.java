package webshop2024api;

import static io.restassured.RestAssured.given;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.numberMatches;
import static org.evomaster.client.java.controller.expect.ExpectationHandler.expectationHandler;
import static org.evomaster.client.java.sql.dsl.SqlDsl.sql;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertNotNull;

import hr.algebra.api.webshop2024api.EvoMasterDriver;
import io.restassured.RestAssured;
import io.restassured.config.JsonConfig;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.ValidatableResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.evomaster.client.java.controller.SutHandler;
import org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import org.evomaster.client.java.controller.expect.ExpectationHandler;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




/**
 * This file was automatically generated by EvoMaster on 2024-07-17T23:27:49.171+02:00[Europe/Belgrade]
 * <br>
 * The generated test suite contains 4 tests
 * <br>
 * Covered targets: 187
 * <br>
 * Used time: 2h 0m 2s
 * <br>
 * Needed budget for current results: 83%
 * <br>
 * This file contains one example of each category of fault. The test cases in this file are a subset of the set of test cases likely to indicate faults.
 */
public class EvoMaster_fault_representatives_Test {

    
    private static final SutHandler controller = new EvoMasterDriver();
    private static String baseUrlOfSut;
    /** [ems] - expectations master switch - is the variable that activates/deactivates expectations individual test cases
    * by default, expectations are turned off. The variable needs to be set to [true] to enable expectations
    */
    private static boolean ems = false;
    /**
    * sco - supported code oracle - checking that the response status code is among those supported according to the schema
    */
    private static boolean sco = false;
    /**
    * rso - response structure oracle - checking that the response objects match the responses defined in the schema
    */
    private static boolean rso = false;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        assertNotNull(baseUrlOfSut);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetDatabase(Arrays.asList("SHOPPING_CART","CART_ITEMS","CATEGORIES","SUBCATEGORIES","PRODUCTS","ORDER_ITEMS","IMAGE"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    /**
    * [test_0_with500] is a part of 1 or more clusters, as defined by the selected clustering options. 
    * ErrorText_0
    * LastLine_0
    */
    @Test(timeout = 60000)
    public void test_0_with500() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("SHOPPING_CART", 1839L)
            .and().insertInto("CATEGORIES", 1838L)
                .d("NAME", "\"nnazSZn_Wc0OVhzt_\"")
            .and().insertInto("SUBCATEGORIES", 1837L)
                .d("NAME", "\"HrvNMjdtGK8\"")
                .r("CATEGORY_ID", 1838L)
            .and().insertInto("IMAGE", 1836L)
                .d("IMAGE_B64", "\"_EM_64158_XYZ_G\"")
            .and().insertInto("PRODUCTS", 1835L)
                .d("NAME", "\"TzJDd\"")
                .d("PRICE", "0.07461912")
                .r("SUBCATEGORY_ID", 1837L)
            .and().insertInto("CART_ITEMS", 1834L)
                .d("QUANTITY", "769")
                .r("PRODUCT_ID", 1835L)
                .r("CART_ID", 1839L)
            .and().insertInto("SHOPPING_CART", 9417L)
                .d("SESSION_ID", "\"T2dBseBLLNz\"")
                .d("USERNAME", "\"RB5sBTfPdkqr6O\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/webShopApi/cartItems/findByUsername/UUo0rLURLUCU;e")
                .then()
                .statusCode(500) // hr/algebra/api/webshop2024api/CustomResponseErrors/ErrorResponse_16_getPath
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("An unexpected error has occurred"))
                .body("'path'", containsString("/error"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200).contains(res_0.extract().statusCode()));
    }
    
    
    /**
    * [test_1_with500] is a part of 1 or more clusters, as defined by the selected clustering options. 
    * ErrorText_0
    * LastLine_0
    */
    @Test(timeout = 60000)
    public void test_1_with500() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("SHOPPING_CART", 1839L)
            .and().insertInto("CATEGORIES", 1838L)
                .d("NAME", "\"nnazSZn_Wc0OVhzt_\"")
            .and().insertInto("SUBCATEGORIES", 1837L)
                .d("NAME", "\"HrvNMjdtGK8\"")
                .r("CATEGORY_ID", 1838L)
            .and().insertInto("IMAGE", 1836L)
                .d("IMAGE_B64", "\"_EM_64158_XYZ_G\"")
            .and().insertInto("PRODUCTS", 1835L)
                .d("NAME", "\"TzJDd\"")
                .d("PRICE", "0.07461912")
                .r("SUBCATEGORY_ID", 1837L)
            .and().insertInto("CART_ITEMS", 1834L)
                .d("QUANTITY", "769")
                .r("PRODUCT_ID", 1835L)
                .r("CART_ID", 1839L)
            .and().insertInto("SHOPPING_CART", 9417L)
                .d("SESSION_ID", "\"T2dBseBLLNz\"")
                .d("USERNAME", "\"RB5sBTfPdkqr6O\"")
            .and().insertInto("SHOPPING_CART", 1591L)
                .d("SESSION_ID", "\"UUo0rLURLUCU;e\"")
                .d("USERNAME", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/webShopApi/cartItems/findBySession/UUo0rLURLUCU;e")
                .then()
                .statusCode(500) // hr/algebra/api/webshop2024api/CustomResponseErrors/ErrorResponse_16_getPath
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("An unexpected error has occurred"))
                .body("'path'", containsString("/error"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200).contains(res_0.extract().statusCode()));
    }
    
    
    @Test(timeout = 60000)
    public void test_2() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("CATEGORIES", 772L)
                .d("NAME", "\"\"")
            .and().insertInto("SUBCATEGORIES", 771L)
                .d("NAME", "\"I6yfIjUuxOxv7x\"")
                .r("CATEGORY_ID", 772L)
            .and().insertInto("SHOPPING_CART", 8402L)
                .d("SESSION_ID", "NULL")
                .d("USERNAME", "\"\"")
            .and().insertInto("SHOPPING_CART", 8403L)
                .d("SESSION_ID", "NULL")
                .d("USERNAME", "\"_EM_89789_XYZ_\"")
            .and().insertInto("SHOPPING_CART", 8404L)
                .d("SESSION_ID", "\"RxehD\"")
                .d("USERNAME", "NULL")
            .and().insertInto("CATEGORIES", 11783L)
                .d("NAME", "\"dgInzugA02c2VS\"")
            .and().insertInto("SUBCATEGORIES", 11782L)
                .d("NAME", "\"iXLf\"")
                .r("CATEGORY_ID", 11783L)
            .and().insertInto("IMAGE", 11781L)
                .d("IMAGE_B64", "\"mD494VKS_9\"")
            .and().insertInto("PRODUCTS", 11780L)
                .d("DESCRIPTION", "\"r\"")
                .d("NAME", "\"WZ14vALFZ9YePpX5\"")
                .d("PRICE", "0.63768697")
                .d("IMAGE_ID", "NULL")
                .r("SUBCATEGORY_ID", 771L)
            .and().insertInto("CATEGORIES", 11787L)
                .d("NAME", "\"j29rXdt2bB\"")
            .and().insertInto("SUBCATEGORIES", 11786L)
                .d("NAME", "\"W49bL\"")
                .r("CATEGORY_ID", 11783L)
            .and().insertInto("IMAGE", 11785L)
                .d("IMAGE_B64", "\"jeAmnLJsSY8YN6O\"")
            .and().insertInto("PRODUCTS", 11784L)
                .d("DESCRIPTION", "\"8uJHIAKC2NDoMk\"")
                .d("NAME", "\"SV\"")
                .d("PRICE", "0.27346116")
                .d("IMAGE_ID", "NULL")
                .r("SUBCATEGORY_ID", 11782L)
            .and().insertInto("CATEGORIES", 11791L)
                .d("NAME", "\"keRKV6_L\"")
            .and().insertInto("SUBCATEGORIES", 11790L)
                .d("NAME", "\"m\"")
                .r("CATEGORY_ID", 11791L)
            .and().insertInto("IMAGE", 11789L)
                .d("IMAGE_B64", "\"n1pgixRI7Iz\"")
            .and().insertInto("PRODUCTS", 11788L)
                .d("DESCRIPTION", "\"zrm0fX2FY\"")
                .d("NAME", "\"p2HEISPkio0mT2\"")
                .d("PRICE", "0.5786728")
                .d("IMAGE_ID", "NULL")
                .r("SUBCATEGORY_ID", 11786L)
            .and().insertInto("CATEGORIES", 11795L)
                .d("NAME", "\"\"")
            .and().insertInto("SUBCATEGORIES", 11794L)
                .d("NAME", "\"dpMfenrFLIj0fZM\"")
                .r("CATEGORY_ID", 11783L)
            .and().insertInto("IMAGE", 11793L)
                .d("IMAGE_B64", "\"lX\"")
            .and().insertInto("PRODUCTS", 11792L)
                .d("DESCRIPTION", "NULL")
                .d("NAME", "\"8VB3d\"")
                .d("PRICE", "0.6966895")
                .d("IMAGE_ID", "NULL")
                .r("SUBCATEGORY_ID", 11794L)
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"subcategoryId\": 8, " + 
                    " \"name\": \"SN7x_3\", " + 
                    " \"category\": { " + 
                    " \"name\": \"eqEjzC5xKw6t\" " + 
                    " } " + 
                    " } ")
                .put(baseUrlOfSut + "/webShopApi/subcategories/4")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("org.hibernate.TransientPropertyValueException: object references an unsaved transient instance - save the transient instance before flushing : hr.algebra.dal.webshop2024dal.Entity.Subcategory.category -> hr.algebra.dal.webshop2024dal.Entity.Category; nested exception is java.lang.IllegalStateException: org.hibernate.TransientPropertyValueException: object references an unsaved transient instance - save the transient instance before flushing : hr.algebra.dal.webshop2024dal.Entity.Subcategory.category -> hr.algebra.dal.webshop2024dal.Entity.Category"))
                .body("'path'", containsString(""));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList("name")));
    }
    
    
    @Test(timeout = 60000)
    public void test_3() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("CATEGORIES", 2663L)
                .d("NAME", "\"_EM_51719_XYZ_\"")
            .and().insertInto("CATEGORIES", 2664L)
                .d("NAME", "\"5_V\"")
            .and().insertInto("CATEGORIES", 2665L)
                .d("NAME", "\"_xR\"")
            .and().insertInto("CATEGORIES", 2666L)
                .d("NAME", "\"_EM_51720_XYZ_\"")
            .and().insertInto("SHOPPING_CART", 2837L)
                .d("SESSION_ID", "NULL")
                .d("USERNAME", "\"CkM3kQk0zD\"")
            .and().insertInto("SHOPPING_CART", 2838L)
                .d("SESSION_ID", "\"Y55B7dBsHV4xTY\"")
                .d("USERNAME", "\"\"")
            .and().insertInto("CATEGORIES", 3690L)
                .d("NAME", "\"\"")
            .and().insertInto("SUBCATEGORIES", 3689L)
                .d("NAME", "\"U\"")
                .r("CATEGORY_ID", 2663L)
            .and().insertInto("CATEGORIES", 3692L)
                .d("NAME", "\"MSKcZb4V2Sq4m4mV\"")
            .and().insertInto("SUBCATEGORIES", 3691L)
                .d("NAME", "\"Ls9CDHMLJrHhCpp\"")
                .r("CATEGORY_ID", 2663L)
            .and().insertInto("CATEGORIES", 3694L)
                .d("NAME", "\"6\"")
            .and().insertInto("SUBCATEGORIES", 3693L)
                .d("NAME", "\"_EM_51721_XYZ_\"")
                .r("CATEGORY_ID", 2665L)
            .and().insertInto("CATEGORIES", 7546L)
                .d("NAME", "\"_EM_51722_XYZ_\"")
            .and().insertInto("SUBCATEGORIES", 7545L)
                .d("NAME", "\"_EM_51723_XYZ_\"")
                .r("CATEGORY_ID", 2664L)
            .and().insertInto("IMAGE", 7544L)
                .d("IMAGE_B64", "\"m64m3N\"")
            .and().insertInto("PRODUCTS", 7543L)
                .d("DESCRIPTION", "\"_EM_51724_XYZ_\"")
                .d("NAME", "\"xHEyf1pk\"")
                .d("PRICE", "0.4686513")
                .r("IMAGE_ID", 7544L)
                .r("SUBCATEGORY_ID", 7545L)
            .and().insertInto("CATEGORIES", 7550L)
                .d("NAME", "\"_EM_51725_XYZ_\"")
            .and().insertInto("SUBCATEGORIES", 7549L)
                .d("NAME", "\"_EM_51726_XYZ_\"")
                .r("CATEGORY_ID", 7546L)
            .and().insertInto("IMAGE", 7548L)
                .d("IMAGE_B64", "\"6d_S\"")
            .and().insertInto("PRODUCTS", 7547L)
                .d("DESCRIPTION", "NULL")
                .d("NAME", "\"D7UF9O3rLr\"")
                .d("PRICE", "0.9569674")
                .r("IMAGE_ID", 7544L)
                .r("SUBCATEGORY_ID", 7545L)
            .and().insertInto("CATEGORIES", 7554L)
                .d("NAME", "\"UqZWW2fXylHazU\"")
            .and().insertInto("SUBCATEGORIES", 7553L)
                .d("NAME", "\"XOUYF2Z\"")
                .r("CATEGORY_ID", 3694L)
            .and().insertInto("IMAGE", 7552L)
                .d("IMAGE_B64", "\"FliIiAKKn\"")
            .and().insertInto("PRODUCTS", 7551L)
                .d("DESCRIPTION", "\"1t9QvS06AdXtpp7\"")
                .d("NAME", "\"3tnWpJxqe6hoAWv\"")
                .d("PRICE", "0.66462415")
                .d("IMAGE_ID", "NULL")
                .r("SUBCATEGORY_ID", 3693L)
            .and().insertInto("CATEGORIES", 7558L)
                .d("NAME", "\"7qurAmoSsdiA\"")
            .and().insertInto("SUBCATEGORIES", 7557L)
                .d("NAME", "\"oKnRlOn\"")
                .r("CATEGORY_ID", 3692L)
            .and().insertInto("IMAGE", 7556L)
                .d("IMAGE_B64", "\"pI\"")
            .and().insertInto("PRODUCTS", 7555L)
                .d("DESCRIPTION", "\"_EM_51727_XYZ_\"")
                .d("NAME", "\"MHccGHffvm\"")
                .d("PRICE", "0.74661034")
                .d("IMAGE_ID", "NULL")
                .r("SUBCATEGORY_ID", 7553L)
            .and().insertInto("CATEGORIES", 7562L)
                .d("NAME", "\"_EM_51728_XYZ_\"")
            .and().insertInto("SUBCATEGORIES", 7561L)
                .d("NAME", "\"_EM_51729_XYZ_\"")
                .r("CATEGORY_ID", 2666L)
            .and().insertInto("IMAGE", 7560L)
                .d("IMAGE_B64", "\"duWiHcrslgW\"")
            .and().insertInto("PRODUCTS", 7559L)
                .d("DESCRIPTION", "\"ICZMIvmxZ\"")
                .d("NAME", "\"_EM_51730_XYZ_\"")
                .d("PRICE", "0.9633604")
                .r("IMAGE_ID", 7560L)
                .r("SUBCATEGORY_ID", 3693L)
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"productId\": 229, " + 
                    " \"name\": \"3Q\", " + 
                    " \"description\": \"V3ab6ezX7E7FV\", " + 
                    " \"price\": 0.06884456409783435, " + 
                    " \"subcategory\": { " + 
                    " \"name\": \"USenfcfW\", " + 
                    " \"category\": { " + 
                    " \"name\": \"6ynYWuxjw\" " + 
                    " } " + 
                    " }, " + 
                    " \"imageUrl\": \"zepKP\", " + 
                    " \"b64image\": \"TlJA9n_wa9T\" " + 
                    " } ")
                .post(baseUrlOfSut + "/webShopApi/products")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(400.0))
                .body("'message'", containsString("Validation failed"))
                .body("'errors'.'price'", containsString("Price must not exceed 6 digits in the integer part and 2 digits in the fraction part"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200).contains(res_0.extract().statusCode()));
    }


}
