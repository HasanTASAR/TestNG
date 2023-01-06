package tests.Day14_testNGFreamwork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethod {

    @Test
    public void ilkTest(){
        System.out.println("İlk test calisti");
        Assert.assertTrue(5>9);
    }

    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }

    @Test(dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("üçüncü test calisti");
    }
}
