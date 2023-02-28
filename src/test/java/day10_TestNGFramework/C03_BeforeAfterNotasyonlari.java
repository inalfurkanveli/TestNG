package day10_TestNGFramework;

import org.testng.annotations.*;

public class C03_BeforeAfterNotasyonlari {
    /*
    Smoke Test
    Regression Test
    EndToEnd(E2E)

    Test Suite : Birden fazla Test'in bir amac icin bir araya getirilmesidir.

    Test : bir amac icin bir araya getirilmis test methodlari class'lari
    veya packagelari icerir



    Test Hiyerarsisi :
    -Suit
    -Test
    -groups , package, classes, methods
           */

   @BeforeTest
   public void beforeTest(){
       System.out.println("Before Test");
   }

    @BeforeClass
    public void beforeClass(){System.out.println("Before Class");}

    @BeforeMethod
    public void beforeMethod(){System.out.println("Before Method");}

    @Test
    public void test01(){System.out.println(" Test1");}

    @Test
    public void test02(){System.out.println("Test2");}

    @Test
    public void test03(){System.out.println("Test3");}

    @AfterTest
    public void afterTest(){System.out.println("After Test");}

    @AfterClass
    public void afterClass(){System.out.println("After Class");}

    @AfterMethod
    public void afterMethod(){System.out.println("After Method");}


}
