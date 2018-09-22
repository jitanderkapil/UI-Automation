package com.mycom.test.features_ui;

import org.fluentlenium.core.FluentAdapter;

import com.mycom.test.nova.selenium.BrowserDriver;
import com.mycom.test.nova.utils.Util;
import com.mycom.test.ui.containers.Authentication;
import com.mycom.test.ui.containers.UserAccessMainPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ManageUserAccess extends FluentAdapter
{
   private Authentication m_Authentication_clp = new Authentication();
   private UserAccessMainPage m_UserCLPAccessMainPage = new UserAccessMainPage();

   @Given("^I access the common launch page Web Client$")
   public void i_access_the_common_launch_page_Web_Client() throws Throwable
   {
      {
         // if previous test has failed then url contains nova BUT we must close the browser and reopen
         if (BrowserDriver.getCurrentDriver().getCurrentUrl().contains("nova") && !BrowserDriver.getCurrentDriver().getCurrentUrl().contains("nova.oauth"))
         {
            BrowserDriver.close();
            m_Authentication_clp = new Authentication();
            m_UserCLPAccessMainPage = new UserAccessMainPage();
         }

         goTo(m_Authentication_clp);

         Util.waitForMillis(600);
      }
   }

   @Then("^I logout from the User Web Client$")
   public void i_logout_from_the_User_Web_Client() throws Throwable
   {
      Util.waitForMillis(30000);
      m_UserCLPAccessMainPage.logout();
      m_Authentication_clp.isAt();
      Util.waitForMillis(30000);
      BrowserDriver.close();
   }
}
