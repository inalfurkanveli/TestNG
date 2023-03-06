package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C05_softAssert  extends TestBaseRapor {
    @Test
    public void  amazonTest(){
        /*
        Genel olarak Test edin denirse HardAssert
        dogrulayin (verify) denirse softAssert kastedilir
         */

        // amazon anasayfaya gidip dogru sayfaya gittigimizi dogrulayin (verify)
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"url ramazon icermiyor");

        //Nutella icin arama yapip.sonuclarin Nutella icerdigini test edin
        AmazonPage amazonPage=new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        expectedIcerik="Nutella";
        String actualAramaSonucYazisi=amazonPage.aramaSonucElementi.getText();
        softAssert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik),"Arama sonucu nutella icermiyor");

        // ilk urune tiklayip. uruun isminde nutella gectigini dogrulayin
        amazonPage.ilkUrun.click();
        expectedIcerik="Nutella";
        String actualIlkUrunIsim=amazonPage.ilkUrunIsimElementi.getText();

        softAssert.assertTrue(actualIlkUrunIsim.contains(expectedIcerik),"arama sonucu nutella icermiyor");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
