package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;

public class Accounts extends BaseClass{
	
	
	/*@Then("getID")
    public void GetId() {
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println("LeadID: "+leadID);
    }*/
	
	@And("Click on the delete")
	public void delete() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Then("After Click findLead")
	public void DeleteLeadVerify() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		System.out.println("Delete Lead Completed.");
	}
	/*@Given("Enter Id")
	   public void enterId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@When("After Click findLead")
	   public void AfterFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("TextMatch")
	   public void textMatch() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}*/
}
