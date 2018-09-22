package com.mycom.test.features_ui;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber", "json:target/cucumber_ui_firefox.json" }, tags = { "~@ignore", "~@noFF" })
public class ITRunCukesUI
{}
