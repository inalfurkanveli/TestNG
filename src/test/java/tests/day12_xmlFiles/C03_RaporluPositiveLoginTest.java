package tests.day12_xmlFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_RaporluPositiveLoginTest extends TestBaseRapor {
    @Test
    public void positiveLoginTest(){
        extentTest=extentReports.createTest("Positive Login Test","gecerli bilgilerle giris yapilabilmeli");
        //qd anasayfaya gidin
        extentTest.info("Qualitydemy anasayfaya gidildi");
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin
        QdPage qdPage=new QdPage();
        qdPage.firstLoginLink.click();
        extentTest.info("ilk login linkine tiklandi");


        // gecerli kullanici adi ve password ile giris yapin
        qdPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("Gecerli email yazildi");
        qdPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Gecerli password yazildi");
        qdPage.loginButton.click();
        extentTest.info("Login butonuna basildi");


        // basirili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.successfulLogin.isDisplayed());
        extentTest.pass("Basarili sekildi giris yapildi. Test edildi.");


    }
}
