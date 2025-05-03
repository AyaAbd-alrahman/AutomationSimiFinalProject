package AutomationSimiFinalProject.AutomationSimiFinalProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver = new ChromeDriver();

	Random rand = new Random();

	@BeforeTest
	public void mySetup() {

		driver.get("https://codenboxautomationlab.com/practice/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test(priority = 1, enabled = false)
	public void RadioButton() {

		List<WebElement> AllRadioButton = driver.findElements(By.className("radioButton"));

		int totalRadioButtons = driver.findElements(By.className("radioButton")).size();

		// this is to select random radio button
		int RandomRadioButtonIndex = rand.nextInt(totalRadioButtons);

		AllRadioButton.get(RandomRadioButtonIndex).click();

		/*
		 * __ if you need to select spcific raido button to be clicked __
		 * 
		 * AllRadioButton.get(0).click(); AllRadioButton.get(1).click();
		 * AllRadioButton.get(2).click();
		 * 
		 */
	}

	@Test(priority = 2, enabled = false)
	public void autoCompleteTest() throws InterruptedException {
		WebElement autoCompleteInputField = driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input"));

		String[] countries = { "jo", "sy", "ja", "ye" };

		int randomIndex = rand.nextInt(countries.length);

		System.out.println(randomIndex);
		autoCompleteInputField.sendKeys(countries[randomIndex]);
		Thread.sleep(1000);
		autoCompleteInputField.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));

	}

	@Test(priority = 3, enabled = false)
	public void SelectTag() {

		WebElement TheSelector = driver.findElement(By.id("dropdown-class-example"));
		Select mySelect = new Select(TheSelector);

		// mySelect.selectByVisibleText("Appium");

		// mySelect.selectByIndex(1);

		mySelect.selectByValue("option3");

		// System.out.println(TheSelector.findElements(By.tagName("option")).size());

	}

	@Test(priority = 4, enabled = false)
	public void CheckBoxTest() throws InterruptedException {

		// to scroll

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("window.scrollTo(0,200)");
//		
//		Thread.sleep(2000);

		WebElement DivOfCheckBox = driver.findElement(By.id("checkbox-example"));

		List<WebElement> AllCheckBoxes = DivOfCheckBox.findElements(By.tagName("input"));

		int randomIndex1 = rand.nextInt(AllCheckBoxes.size());
		int randomIndex2 = rand.nextInt(AllCheckBoxes.size());

		// to select two random box
		AllCheckBoxes.get(randomIndex1).click();
		AllCheckBoxes.get(randomIndex2).click();

		// if you want to select all the checkboxes

//	for(int i = 0 ; i < AllCheckBoxes.size();i++) {
//		AllCheckBoxes.get(i).click();
//
//	}

	}

	@Test(priority = 5, enabled = false)
	public void Window_Example() throws InterruptedException {
		WebElement SwitchWindowButton = driver.findElement(By.id("openwindow"));

		SwitchWindowButton.click();

		Set<String> handles = driver.getWindowHandles();

		List<String> windowList = new ArrayList<>(handles);

		driver.switchTo().window(windowList.get(1));

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"menu-item-9660\"]/a/span[1]")).click();

		driver.switchTo().window(windowList.get(0));
		Thread.sleep(2000);

		System.out.println(driver.getTitle());
	}

	@Test(priority = 6, enabled = false)
	public void Switch_Tab_Example() throws InterruptedException {
		WebElement SwitchTabButton = driver.findElement(By.id("opentab"));

		SwitchTabButton.click();

		Set<String> handles = driver.getWindowHandles();

		List<String> TabList = new ArrayList<>(handles);

		driver.switchTo().window(TabList.get(1));

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		driver.switchTo().window(TabList.get(0));
		Thread.sleep(2000);

		System.out.println(driver.getTitle());
	}

	@Test(priority = 7, enabled = false)
	public void AlertTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement InputFieldForTheName = driver.findElement(By.id("name"));
		InputFieldForTheName.sendKeys("abedalraheem");

		WebElement AlertButton = driver.findElement(By.id("alertbtn"));
		AlertButton.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
	}

	@Test(priority = 8, enabled = false)
	public void ConfirmTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement InputFieldForTheName = driver.findElement(By.id("name"));
		InputFieldForTheName.sendKeys("abedalraheem");

		WebElement AlertButton = driver.findElement(By.id("confirmbtn"));
		AlertButton.click();
		Thread.sleep(2000);

		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}

	@Test(priority = 9, enabled = false)
	public void TableTest() {

		// to prirnt all the rows

		WebElement theTable = driver.findElement(By.id("product"));

		List<WebElement> AllRows = theTable.findElements(By.tagName("tr"));
		List<WebElement> AllData = theTable.findElements(By.tagName("td"));

		// this is the logic to print random row

//	int randomRow = 	rand.nextInt(AllRows.size());
//		System.out.println(AllRows.get(randomRow).getText());

		// to print all the rows
//		for (int i = 0; i < AllRows.size(); i++) {
//
//			System.out.println(AllRows.get(i).getText());
//		}

		for (int i = 2; i < AllData.size(); i = i + 3) {

			System.out.println(AllData.get(i).getText());
		}

	}

	@Test(priority = 10, enabled = false)
	public void HideAndShow() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(2000);

		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		HideButton.click();
		Thread.sleep(2000);
		WebElement ShowButton = driver.findElement(By.id("show-textbox"));

		ShowButton.click();
	}

	@Test(priority = 11, enabled = false)
	public void EnableDisable() throws InterruptedException {

		WebElement DisableButton = driver.findElement(By.id("disabled-button"));
		DisableButton.click();
		Thread.sleep(2000);
		WebElement InputField = driver.findElement(By.id("enabled-example-input"));
		WebElement EnabledButton = driver.findElement(By.id("enabled-button"));
		EnabledButton.click();
		InputField.sendKeys("soso");
	}

	@Test(priority = 12,enabled = false)
	public void MouseHover() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,1800)");
		Thread.sleep(2000);

		WebElement TheElementINeedToMoveTo = driver.findElement(By.id("mousehover"));

		Actions action = new Actions(driver);

		action.moveToElement(TheElementINeedToMoveTo).click().perform();
		Thread.sleep(2000);

		//WebElement TopPartial = driver.findElement(By.linkText("To"));

		//WebElement Top = driver.findElement(By.linkText("Top"));
		WebElement Reload = driver.findElement(By.linkText("Reload"));


		Reload.click();
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 13,enabled = false)
	public void calender() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,1900)");
		Thread.sleep(2000);
		
		WebElement CalenderTab = driver.findElement(By.linkText("Booking Calendar")); 
		CalenderTab.click();
		
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();

		List<String> TabList = new ArrayList<>(handles);

		driver.switchTo().window(TabList.get(1));
		
		WebElement TheTable = driver.findElement(By.cssSelector(".datepick.wpbc_calendar"));
		
		List<WebElement> tds= TheTable.findElements(By.tagName("td")); 
		
		for(int i = 0 ; i < tds.size();i=i+2) {
			System.out.println(tds.get(i).getText());
		}
		
	}
	
	@Test(priority = 14,enabled = false)
	public void Iframe() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,2200)");
		Thread.sleep(2000);
		driver.switchTo().frame("iframe-name");		

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();

		List<String> TabList = new ArrayList<>(handles);

		driver.switchTo().window(TabList.get(0));
		Thread.sleep(2000);

		WebElement CalenderTab = driver.findElement(By.linkText("Booking Calendar")); 
		CalenderTab.click();
		
		Set<String> handles2 = driver.getWindowHandles();

		List<String> TabList2 = new ArrayList<>(handles2);

		driver.switchTo().window(TabList2.get(1));
		
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 15)
	public void DownloadApp() {
		WebElement DownloadButton = driver.findElement(By.linkText("Download Apk files"));
				DownloadButton.click();
	}

}
