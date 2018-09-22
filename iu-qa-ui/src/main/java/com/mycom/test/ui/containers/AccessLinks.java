package com.mycom.test.ui.containers;

import java.io.UnsupportedEncodingException;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.filter.FilterConstructor;
import org.openqa.selenium.WebDriver;

import com.mycom.test.nova.selenium.BrowserDriver;
import com.mycom.test.nova.selenium.UiUtils;
import com.mycom.test.nova.selenium.UiUtils.AwaitType;

public class AccessLinks extends FluentPage
{
   private final WebDriver driver;

   public AccessLinks()
   {
      driver = BrowserDriver.getCurrentDriver();
      initFluent(driver);
      initTest();
   }

   public String AppLinkMember(String applicationName, String applicationLink) throws UnsupportedEncodingException
   {
      String paramValue = null;
      isAt();

      String fitlerPattern = ".webapp";
      if (applicationName.equals(applicationLink))
      {
         fitlerPattern = ".productLink";
      }
      UiUtils.awaitUntil(this, fitlerPattern, AwaitType.AREENABLED);
      find(fitlerPattern, FilterConstructor.withText(applicationLink)).click();

      return paramValue;
   }

}
