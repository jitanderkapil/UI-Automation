package com.mycom.test.ui.containers;

import static org.fest.assertions.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentList;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mycom.test.nova.selenium.BrowserDriver;
import com.mycom.test.nova.selenium.UiUtils;
import com.mycom.test.nova.selenium.UiUtils.AwaitType;
import com.mycom.test.nova.utils.Util;

public class UserAccessMainPage extends FluentPage
{
   private static final Logger logger = LoggerFactory.getLogger(UserAccessMainPage.class);

   private final WebDriver driver;

   public UserAccessMainPage()
   {
      driver = BrowserDriver.getCurrentDriver();
      initFluent(driver);
      initTest();
   }

   @Override
   public String getUrl()
   {
      logger.debug("MainPage 'getUrl'");
      return Util.getSystemProperty("service.url").concat("?download=false#main");
   }

   @Override
   public void isAt()
   {
      logger.debug("MainPage 'isAt'");
      UiUtils.awaitUntil(this, "#gwt-debug-HomePageNavigation", AwaitType.HASSIZEEQUAL, 1);
   }

   public void assertLoginSuccess(String userName) throws InterruptedException
   {
      logger.debug("MainPage 'assertLoginSuccess'");
      UiUtils.awaitUntil(this, "#userName", AwaitType.HASSIZEEQUAL, 1);

      assertThat(find("#userName").getText()).isEqualTo(userName);
   }

   public void logout()
   {

      FluentList<?> logoutLink = find("#signout");
      assertThat(logoutLink.size()).as("Logout link is present & unique").isEqualTo(1);
      logoutLink.click();

   }

}
