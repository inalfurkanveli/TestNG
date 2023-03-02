package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PositiveLoginTest {
    @Test (groups = "smoke")
    public void positiveLoginTest(){
        //qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin
        QdPage qdPage=new QdPage();
        qdPage.firstLoginLink.click();


        // gecerli kullanici adi ve password ile giris yapin
        qdPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButton.click();


        // basirili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.successfulLogin.isDisplayed());

        Driver.closeDriver();
    }
}
