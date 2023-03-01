package day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_NegativeLoginTest {
    QdPage qdPage = new QdPage();

    @Test
    public void negativeLoginTest1() {

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        qdPage.firstLoginLink.click();
        qdPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qdPage.loginButton.click();

        Assert.assertTrue(qdPage.emailBox.isEnabled());

        //qd anasayfaya gidin 3 test methodu olusturun
        //1- gecerli username gecersiz password
        //2- gecersiz username gecerli password
        //3- gecersiz uzername gecersiz password

        Driver.closeDriver();
    }

    @Test
    public void negativeLoginTest2() {
        QdPage qdPage = new QdPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        qdPage.firstLoginLink.click();
        qdPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButton.click();

        Assert.assertTrue(qdPage.emailBox.isEnabled());
        Driver.closeDriver();
    }

    @Test
    public void negativeLoginTest3() {
        QdPage qdPage = new QdPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        qdPage.firstLoginLink.click();
        qdPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qdPage.loginButton.click();

        Assert.assertTrue(qdPage.emailBox.isEnabled());
        Driver.closeDriver();
    }
}