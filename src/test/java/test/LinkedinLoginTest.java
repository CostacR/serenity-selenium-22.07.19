package test;

import com.ibm.icu.impl.UResource;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yecht.Data;

import java.util.Collection;
import java.util.Arrays;

@RunWith(SerenityParameterizedRunner.class)//объявляем Серенити параметризированую
public class LinkedinLoginTest extends BaseTest{

    @TestData//DataProvider
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"nsczxfxthntq@gmail.com", "4838960w"}//данные для dataProvider
        });
    }


    private String login;
    private String password;

    public LinkedinLoginTest(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        user.openLandingPage();
        Thread.sleep(500);
//        System.out.println(user.checkLandingPageTitle());

        user.loginMenuCheck();
        Thread.sleep(5000);
        user.login(login, password);




    }
}
