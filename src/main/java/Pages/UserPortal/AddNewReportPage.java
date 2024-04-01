package Pages.UserPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AddNewReportPage {
    private WebDriver driver;

    /*** AddNewReport Page Locators ***/
    public AddNewReportPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectActivity(){
        Select activityDropdown = new Select(driver.findElement(By.xpath("//ngx-select-dropdown/div[@tabindex='0']")));
        activityDropdown.selectByVisibleText("Automation Activity"); // To expand the dropdown
    }
    public LocationPage selectEvent() {

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement activityDropdown = driver.findElement(By.xpath("//ngx-select-dropdown/div[@tabindex='0']"));
        activityDropdown.click(); // To expand the dropdown
        WebElement selectReportType = driver.findElement(By.xpath("//ngx-select-dropdown/div/div/ul[2]/li[1]"));
        selectReportType.click();
        WebElement nextButton = driver.findElement(By.cssSelector("button.chk-primary-btn[title='التالي']"));
        nextButton.click();
        return new LocationPage(driver);
    }
}
