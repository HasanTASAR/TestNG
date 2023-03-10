package tests.Day14_testNGFreamwork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;

public class C05_SoftAssert {
    @Test(groups = {"minireg2","smoke"})
    public  void test01(){
        //1.adım softAsset objesi oluşturmak
        SoftAssert softAssert=new SoftAssert();

        // 2. adım softAsset objesini kullanarak istenilen assertion'ları yapın
        softAssert.assertEquals(6,6); //passed
        System.out.println("1.assertion sonrası");
        softAssert.assertTrue(5>3); // PASSED
        System.out.println("2.assertion sonrası");
        softAssert.assertFalse(3>5); // passed
        System.out.println("3.assertion sonrası");

        //3. adım softAsset'e raporla diyecegiz
        softAssert.assertAll(); // bu satırda çalışma durur çünkü FAILED olan assertion var
        System.out.println("assertAll sonrasi");
    }

}
