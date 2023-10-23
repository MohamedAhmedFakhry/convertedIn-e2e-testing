package pom;

import Utils.MailLocators;
import Utils.SeleniumActions;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;
import static Utils.SeleniumActions.Waits.VISIBILITY_OF_ELEMENT;

public class CreateMailCampaigns {
    public void selectCampaignType(){
        SeleniumActions seleniumActions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        seleniumActions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.oneTimeNextButton);
        seleniumActions.click(locators.oneTimeNextButton);
        seleniumActions.click(locators.templateGroups);

    }


    public void oneTimeCampaign(By hoverPath, By clickPath) {

        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        actions.waitUntil(VISIBILITY_OF_ELEMENT,locators.hoverOnBlackFriday);
        actions.hoverOnElement(hoverPath);
        actions.click(clickPath);
        String oneTimeCampaign = actions.getText(locators.assertBlackFriday);
        Assert.assertEquals(oneTimeCampaign, "Hello Black Friday","one-time campaign is work");
        Assert.assertNotNull(oneTimeCampaign, "assertion one-time campaign is null");
    }
}
