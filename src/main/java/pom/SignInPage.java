package pom;

import Utils.MailLocators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;

public class SignInPage extends SeleniumBase {
    public void loginPage(String Email, String Password) {

        MailLocators locators = new MailLocators();
        SeleniumActions actions = new SeleniumActions();
        actions.clear(locators.LoginEmail);
        actions.sendKeys(locators.LoginEmail, Email);
        actions.clear(locators.LoginPassword);
        actions.sendKeys(locators.LoginPassword, Password);
        actions.click(locators.LoginButton);
        String login = actions.getText(locators.assertLogin);
        Assert.assertEquals(login, "Home", "login successfully");
        Assert.assertNotNull(login, "assertion login is null");

    }
}
