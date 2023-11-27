package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;
import runner.Hooks;

public class CreateLead extends BaseClass{

	
	/*@Given("Launch the browser")
	public void launch_the_browser() {
	    driver = new ChromeDriver();
	}

	@Given("Load the url")
	public void load_the_url() {
	    driver.get("http://leaftaps.com/opentaps/");
	}*/

	@Given("Enter the username as {string}")
	public void enter_the_username(String usrName) {
	    driver.findElement(By.id("username")).sendKeys(usrName);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify login is successfull")
	public void verify_login_is_successfull() {
	   String title = driver.getTitle();
	   if(title.contains("Leaftaps")) {
		   System.out.println("Title is verified");
	   }
	}
	
	
	@When ("Click on the crmsfa")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When ("Click on the Leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When ("Click on the Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given ("Enter the company name as {string}")
	public void enterCname(String cName) {
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("cName");
	}
	@Given ("Enter the first name as {string}")
	public void enterFname(String fName) {
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("fName");
	}
	@Given ("Enter the last name as {string}")
	public void enterLname(String lName) {
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys(lName);
	}
	@When ("Click on the submit button")
	public void clickSubmit() {
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
	}
	@Then ("Verify Create Lead is successfull")
	public void verifyCreateLead() {
		String leadPage = driver.findElement(By.tagName("title")).getText();
		if(leadPage.contains("View Lead")) {
			System.out.println("Lead create successfully");
		}else {
			System.out.println("Lead is not create Lead");
		}
	}
	@Given ("Get the lead id")
	public void getLeadId() {
		String leadId_Cname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadId = leadId_Cname.replaceAll("[^0-9]", "");
		
		System.out.println("leadId_Cname : " +leadId_Cname);
		System.out.println("leadId : " +leadId);
	}
	
	/*@When ("Close the browser")
	public void closeBrowser() {
		driver.close();
	}*/
	
	@And("Click the findLead")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When ("Click the phno")
	public void enterUName() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Enter the phno as {string}")
	public void phNum(String phnum){
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
	}
	
	@When ("Click on the find leads")
	public  void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	
	@When ("Click on the first Result ID")
	public  void clickFindLeadsId() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
	}
	
	@And("Click on the edit button")
	public  void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Given ("update the cname as {string}")
	public  void updateCname(String cName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
	}
	@When ("click on the update button")
	public  void clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Edit Lead Completed.");
	}
	
	@Given("Enter the uName")
	public void uname() {
		driver.findElement(By.id("username")).sendKeys("Demomanager");
	}
	
}
