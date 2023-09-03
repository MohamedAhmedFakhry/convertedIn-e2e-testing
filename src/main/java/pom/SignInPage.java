package pom;

import Utils.MailLocators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;

public class SignInPage extends SeleniumBase {
    public void loginPage(String Email, String Password) {

        MailLocators locators = new MailLocators();
        SeleniumActions actions = new SeleniumActions();
        actions.clear(locators.loginEmail);
        actions.sendKeys(locators.loginEmail, Email);
        actions.clear(locators.loginPassword);
        actions.sendKeys(locators.loginPassword, Password);
        actions.click(locators.loginButton);
        String login = actions.getText(locators.assertLogin);
        Assert.assertEquals(login, "Home", "login successfully");
        Assert.assertNotNull(login, "assertion login is null");

    }
}
