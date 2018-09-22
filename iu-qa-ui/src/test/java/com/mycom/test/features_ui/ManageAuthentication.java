package com.mycom.test.features_ui;

import org.fluentlenium.core.FluentAdapter;

import com.mycom.test.nova.credentials.User;
import com.mycom.test.ui.containers.Authentication;
import com.mycom.test.ui.containers.UserAccessMainPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageAuthentication extends FluentAdapter
{
   private final Authentication m_Authentication_clp = new Authentication();
   private final UserAccessMainPage m_UserCLPAccessMainPage = new UserAccessMainPage();

   @When("^I fill in login name \"(.*?)\" and password \"(.*?)\"$")
   public void i_fill_in_login_name_and_password(String userName, String password) throws Throwable
   {
      m_Authentication_clp.isAt();
      User.get().setUser(userName, password);
      m_Authentication_clp.fillAndSubmitForm();
   }

   @Then("^An error message is visible in the login page$")
   public void an_error_message_is_visible_in_the_login_page() throws Throwable
   {
      m_Authentication_clp.assertCLPLoginFailure();
   }

   @Then("^The user name is visible in the main page header$")
   public void the_user_name_is_visible_in_the_main_page_header() throws Throwable
   {
      m_UserCLPAccessMainPage.assertLoginSuccess(User.get().getUsername());
   }

}
