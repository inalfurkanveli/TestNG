package day10_TestNGFramework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ResuableMethods;

public class C04_FacebookLogin {
    @Test (groups = "smoke")
    public void facebookTesti(){

        //1 - https://www.facebook.com/ adresine gidin
        FacebookPage facebookPage=new FacebookPage();
        Driver.getDriver().get("https://www.facebook.com");

        //cookies butonu kabul edin
        facebookPage.cookiesKabulButonu.click();
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker =new Faker();
        facebookPage.emailKutusu.sendKeys(("abc"+faker.internet().emailAddress()));
        facebookPage.passwordKutusu.sendKeys(faker.internet().password());
        ResuableMethods.bekle(3);
        facebookPage.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilamadiYaziElementi.isDisplayed());
        ResuableMethods.bekle(3);

        Driver.closeDriver();
    }



}
