# AutomationSimiFinalProject

This project is a **Selenium WebDriver + TestNG** automation test suite for practicing different web automation scenarios on the site:  
[https://codenboxautomationlab.com/practice/](https://codenboxautomationlab.com/practice/)

It covers:
- Radio buttons
- Auto-complete input
- Dropdown selections
- Checkboxes
- Window and tab switching
- JavaScript alerts and confirms
- Table interactions
- Show/Hide and Enable/Disable buttons
- Mouse hover events
- Calendar bookings
- Iframe interactions
- APK file download testing

---

## 🛠 Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven (optional for dependency management)
- ChromeDriver

---

## 📂 Project Structure

AutomationSimiFinalProject/ └── src/main/java/AutomationSimiFinalProject/AutomationSimiFinalProject/ └── AppTest.java



---

## 📦 Setup Instructions

1. **Clone the project**
   ```bash
   git clone <your-repo-url>
Open in your IDE (e.g., Eclipse, IntelliJ)

Install Dependencies

Add Selenium Java and TestNG libraries to your project.

Make sure chromedriver is installed and added to your system path.

Project Requirements

Java JDK 11 or later

Chrome Browser installed

ChromeDriver (version matching your Chrome browser)

Run Tests

Right-click the class AppTest.java

Choose Run as ➔ TestNG Test

Or from command line if using Maven:


mvn clean test
🚀 How to Run Specific Test Cases
Each test method inside AppTest.java has a specific purpose. Tests are disabled (enabled = false) by default except DownloadApp.
You can enable any test by setting enabled = true.

Example:


@Test(priority = 1, enabled = true)
public void RadioButton() {
    ...
}
📋 List of Test Cases

Priority	Test Name	Description
1	RadioButton	Selects a random radio button.
2	AutoCompleteTest	Tests auto-complete text input with random country.
3	SelectTag	Selects an option from a dropdown menu.
4	CheckBoxTest	Clicks on random checkboxes.
5	Window_Example	Handles switching between multiple windows.
6	Switch_Tab_Example	Handles switching between tabs.
7	AlertTest	Tests alert pop-up and accepts it.
8	ConfirmTest	Tests confirm pop-up and dismisses it.
9	TableTest	Reads and prints table data.
10	HideAndShow	Tests hiding and showing a text field.
11	EnableDisable	Tests disabling and enabling an input field.
12	MouseHover	Tests mouse hover actions and click inside dropdown.
13	Calendar	Clicks on the calendar tab and extracts table data.
14	Iframe	Switches into an iframe and interacts with it.
15	DownloadApp	Tests clicking a link to download APK files."# AutomationSimiFinalProject" 
"# AutomationSimiFinalProject" 
