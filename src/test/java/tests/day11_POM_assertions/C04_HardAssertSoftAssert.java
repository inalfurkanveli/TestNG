package tests.day11_POM_assertions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssertSoftAssert {

    @Test
    public void hardAssertTesti(){
        Assert.assertTrue(5>4);

        Assert.assertFalse(5==6);

        Assert.assertEquals(5,5);

        Assert.assertNotEquals(5,1);
    }

    @Test
    public void softAssertionTesti(){

        /*
        JUnit teki Assert class'i testNG de de vardir
        Ancak bir test methodun'da birden fazla Failed olan Assertion varsa
        ilk failed olan assertion'da calismayi durdurup exception firlattigindan
        tum hatayi bir defada gorup, hepsini duzeltme sansimiz olmaz

        TestNG bunun icin bir alternatif olusturmus
        Bu alternatifte Assert class'inda ki static methodlari kullanmak yerine

        SoftAssert class'indan obje olusturup
        o obje uzerinden istedigimiz testleri yapiyoruz

        softAssert objesi ile yapilan assertion'lar failed olsada testimiz calismaya devam eder
        ancak testlerin sonuclarini  gormek istedigimizde
        softAssert.assertAll() ile tum yaptigi testleri raporlamasini soyleyebiliriz

        assertAll() methodunun calistigi satirda exception olabilir
         */
        SoftAssert softAssert= new SoftAssert();


        softAssert.assertTrue(5>6,"true testi failed");

        softAssert.assertFalse(5==5,"false testi failed");

        softAssert.assertEquals(5,6,"Equels testi failed");

        softAssert.assertNotEquals(5,5,"Not Equals testi failed");

        softAssert.assertAll();
    }
}
