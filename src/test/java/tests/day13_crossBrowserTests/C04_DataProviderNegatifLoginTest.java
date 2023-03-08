package tests.day13_crossBrowserTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DataProviderNegatifLoginTest {

    @DataProvider
    public static Object[][] kullanicilar(){
        String [][] kullaniciList={{"Zafer","12345"},
                {"Mehmet"},{"34567"},
                {"Sevilay","67890"},
                {"Enver","56789"},
                {"Ahmet Emre","54321"}};

        return kullaniciList;

    }
    @Test(dataProvider = "kullanicilar")
    public void negatifLogin1(String username, String password){
        QdPage qdPage= new QdPage();
        ReusableMethods.bekle(3);
        qdPage= new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.firstLoginLink.click();
        qdPage.emailBox.sendKeys(username);
        qdPage.passwordBox.sendKeys(password);
        ReusableMethods.bekle(2);
        qdPage.loginButton.click();
        Assert.assertTrue(qdPage.emailBox.isEnabled());
        Driver.closeDriver();
    }
}
