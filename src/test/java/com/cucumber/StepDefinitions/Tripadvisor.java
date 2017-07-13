package com.cucumber.StepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;



public class Tripadvisor {
	WebDriver dr;

    @Given("^user is on tripadvisor page$")
    public void navigate() {
              dr=new FirefoxDriver();
              //String tagName = "";
    	   dr.get("http://www.tripadvisor.co.uk/Attractions");
    	   WebElement tagName = dr.findElement(By.cssSelector("input.typeahead_input"));
    	    tagName.sendKeys("California,United States,North America");  
    	    dr.findElement(By.id("SUBMIT_THINGS_TO_DO")).click();
    	    	tagName.submit();			   
    }

    
    @When("^user searches Indoor skydiving in California$")
    public void SearchIndoor(){
    //clickLinkByHref(String href){
    	
    	//dr.findElement(By.className("mag_glass_parent"));
    	 dr.findElement(By.linkText("Types of Attractions"));
     	dr.findElement(By.cssSelector("input#ap_filter_c_")).click();
    	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	// List<WebElement> anchors = dr.findElements(By.tagName("a"));
       //  Iterator<WebElement> i = anchors.iterator();
  
        // while(i.hasNext()) {
           //  WebElement anchor = i.next();
           //  if(anchor.getAttribute("href").contains(href))
           //  {
             //    anchor.click();
              //   break;
           //  }
        // }
         //clickLinkByHref("Outdoor Activities");
   // }
        
    }

    @Then("^user print the name and price of the activity$")
    public void Printresult(){
    	
    	WebElement Name = dr.findElement(By.id("HEADING"));
    			
    	WebElement price = dr.findElement(By.id(""));
    			
    	System.out.println(Name.getText());
    	System.out.println(price.getText());
        dr.close();
        System.exit(0);
    }
}