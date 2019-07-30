package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import page.LandingPage;

public class UserSteps extends ScenarioSteps {

    LandingPage landingPage;
    @Step
    public void openLandingPage(){
        landingPage.open();
    }

    @Step
    public void checkLandingPageUrl(){

    }

    @Step
    public String checkLandingPageTitle(){
        return landingPage.getTitle();
    }

    @Step
    public void loginMenuCheck(){
//        if (Assert.assertTrue(landingPage.elementIsDispayed(landingPage.element("//h2[@class='sign-in-card__header']"))){
//
//        }

//        return landingPage.elementIsDispayed(landingPage.element("//h2[@class='sign-in-card__header']"));
    }

    @Step
    public void login(String login, String password) throws InterruptedException {
        Thread.sleep(300);
        landingPage.find("//input[@name='session_key']").click();
        landingPage.find("//input[@name='session_key']").clear();
        landingPage.find("//input[@name='session_key']").typeAndTab(login);
        landingPage.find("//input[@name='session_password']").type(password);
        Thread.sleep(500);
        landingPage.find("//*[@class='sign-in-form__submit-btn']").click();
        Thread.sleep(10000);


    }

}
