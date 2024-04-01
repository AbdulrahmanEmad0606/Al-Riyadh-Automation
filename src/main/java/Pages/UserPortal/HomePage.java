package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    /*** Home Page Locators ***/
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    Label greetingMSG=new Label(By.xpath("//span[contains(@class,'greeting')]"));
    Button addButton=new Button(By.xpath("//div[2]/chk-button/button"));
    Link taskIcon=new Link(By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/div[1]/a[2]"));
    public boolean getGreetingLabel() throws InterruptedException {
        Thread.sleep(2000);
        return greetingMSG.isDisplayed(By.xpath("//span[contains(@class,'greeting')]"));
    }
    public AddNewReportPage openForm(){
        addButton.waitImplicitly(5);
        addButton.click();
        return new AddNewReportPage(driver);
    }
    public TasksPage navigateToTaskPage() throws InterruptedException {
        Thread.sleep(3000);
        taskIcon.click();
        return new TasksPage(driver);
    }
}
