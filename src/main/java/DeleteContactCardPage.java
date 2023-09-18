import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteContactCardPage extends BasePage{
    public DeleteContactCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "check-box-remove-contact")
    private WebElement deleteContactCheckbox;

    @FindBy(id = "submit-remove")
    private WebElement deleteCardButton;
}
