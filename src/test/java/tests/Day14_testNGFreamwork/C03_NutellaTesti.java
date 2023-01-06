package tests.Day14_testNGFreamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTesti {

    @Test
    public void test01(){
        //amazona git
        Driver.getDriver().get("https://www.amazon.com");

        //nutella arat
        //WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        AmazonPage amazonPage=new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //sonuçların nutella içerdiğini test edin


        String expected="nutella";
        //String actual=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        String actual=amazonPage.amazonActualKelime.getText();
        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();

    }
}
