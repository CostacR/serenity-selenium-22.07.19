package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linkedin.com/")//добавляем аннотацию с дофолтным адресом по которому будет обращаться ВебДрайвер
public class LandingPage extends PageObject {

    @FindBy (xpath = "//*[@class='nav__logo lazy-loaded']")
    private WebElement lazyLogo;

    @FindBy (xpath = "//h2[@class='sign-in-card__header']")
    private WebElement loginMenu;

    @FindBy  (xpath = "//*[@class='nav__button-secondary']")
    private WebElement signInButton;

    @FindBy  (xpath = "//*[@class='sign-in-form__submit-btn']")
    private WebElement signInAcceptButton;

    @FindBy  (xpath = "//*[@class='sign-in-form__forgot-password']")
    private WebElement forgotPasswordButton;

    @FindBy  (xpath = "//*[@class='nav__button-tertiary']")
    private WebElement joinNowButton;

    @FindBy (xpath = "//input[@name='session_key']")
    private WebElement userEmailField;

    @FindBy (xpath = "//input[@name='session_password']")
    private WebElement userPasswordField;

    @FindBy (xpath = "//div[@class='input']/span']")
    private WebElement userPasswordShowButton;

    @FindBy (xpath = "//button[@class='sign-in-card__dismiss-btn']")
    private WebElement closeLoginFormButton;

    public LandingPage(WebDriver driver){
        super((driver));
    }

    public boolean elementIsDispayed(WebElement webElement){
        return webElement.isDisplayed();
    }

}
