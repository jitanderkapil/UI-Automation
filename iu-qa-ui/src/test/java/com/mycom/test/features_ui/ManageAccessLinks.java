package com.mycom.test.features_ui;

import java.util.List;
import java.util.Map;

import org.fluentlenium.core.FluentAdapter;

import com.mycom.test.ui.containers.AccessLinks;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ManageAccessLinks extends FluentAdapter
{
   private AccessLinks m_AccessCLP = new AccessLinks();

   @When("^I check <links> for <applications> on Common Launch Page$")
   public void i_check_Links_for_Applications_on_Common_Launch_Page(DataTable table) throws Throwable
   {
      List<Map<String, String>> Linksdata = table.asMaps(String.class, String.class);
      for (int i = 0; i < Linksdata.size(); i++)
      {
         Map<String, String> currentLinksValue = Linksdata.get(i);
         m_AccessCLP.AppLinkMember(currentLinksValue.get("applications"), currentLinksValue.get("links"));
      }
   }
}
