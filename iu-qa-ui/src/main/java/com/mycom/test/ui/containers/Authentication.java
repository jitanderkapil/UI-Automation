package com.mycom.test.ui.containers;

import org.fest.assertions.Assertions;
import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mycom.test.nova.credentials.User;
import com.mycom.test.nova.selenium.BrowserDriver;
import com.mycom.test.nova.selenium.UiUtils;
import com.mycom.test.nova.selenium.UiUtils.AwaitType;
import com.mycom.test.nova.utils.Util;

public class Authentication extends FluentPage
{

   private static final Logger logger = LoggerFactory.getLogger(Authentication.class);

   private final WebDriver driver;

   public Authentication()
   {
      driver = BrowserDriver.getCurrentDriver();
      initFluent(driver);
      initTest();
   }

   @Override
   public String getUrl()
   {
      logger.debug("LoginPage 'getUrl'");

      return Util.getSystemProperty("service.url");
   }

   @Override
   public void isAt()
   {
      logger.debug("LoginPage 'isAt'");
      UiUtils.awaitUntil(this, "#loginName", AwaitType.HASSIZEEQUAL, 1);
   }

   public void fillAndSubmitForm()
   {
      isAt();
      UiUtils.awaitUntil(this, "#loginName", AwaitType.AREENABLED);
      click("#loginName");
      fill("#loginName").with(User.get().getUsername());
      Assertions.assertThat(find("#loginName").getValue()).as("Login value is as expected after input").isEqualTo(User.get().getUsername());
      UiUtils.awaitUntil(this, "#password", AwaitType.AREENABLED);
      click("#password");
      fill("#password").with(User.get().getPassword());
      Assertions.assertThat(find("#password").getValue()).as("Password value is as expected after input").isEqualTo(User.get().getPassword());
      Util.waitForMillis(500);
      find("#gwt-debug-Login-button").submit();
      Util.waitForMillis(1000);
   }

   public void assertCLPLoginFailure() throws InterruptedException
   {
      logger.debug("LoginPage 'assertLoginFailure'");
      UiUtils.awaitUntil(this, "#gwt-debug-Login-label-Message", AwaitType.HASSIZEEQUAL, 1);
      Assertions
         .assertThat(find("#gwt-debug-Login-label-Message").getText())
         .as("Login failure message is as expected")
         .contains("Incorrect login name or password");
   }
}
