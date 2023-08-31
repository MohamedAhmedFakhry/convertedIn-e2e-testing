package pom;

import Utils.MailLocators;
import Utils.SeleniumActions;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Utils.SeleniumActions.Waits.VISIBILITY_OF_ELEMENT;

public class CreateMailCampaigns {
    public void selectCampaignType(){
        SeleniumActions seleniumActions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        seleniumActions.click(locators.oneTimeNextButton);
        seleniumActions.click(locators.templateGroups);

    }


    public void oneTimeCampaign(By hoverPath, By clickPath) {

        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        actions.waitUntil(VISIBILITY_OF_ELEMENT,locators.hoverOnBackToSchool);
        actions.hoverOnElement(hoverPath);
        actions.click(clickPath);
        String oneTimeCampaign = actions.getText(locators.assertBackToSchool);
        Assert.assertEquals(oneTimeCampaign, "Shopping Season Back To School","one-time campaign is work");
        Assert.assertNotNull(oneTimeCampaign, "assertion one-time campaign is null");
    }
}
