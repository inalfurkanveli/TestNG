package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_configReaderKullanimi {
    @Test
    public void test01(){

        // amazon anasayfa'ya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // Test datasi olarak verilen kelime icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        AmazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        // arama sonuclarinin test datasini icerdigini test edelim

        String expectedIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualAramaSonucYazisi=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();

    }
}
