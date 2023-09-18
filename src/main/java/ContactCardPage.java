import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactCardPage extends BasePage{
    public ContactCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.nav-link[href='/contacts']")
    private WebElement addNewContact;

    @FindBy(id = "btn-edit-contact")
    private WebElement editButton;

    @FindBy(css = "input[formcontrolname='firstName']")
    private WebElement firstNameInputField;

    @FindBy(css = "input[formcontrolname='lastName']")
    private WebElement lastNameInputField;

    @FindBy(css = "input[formcontrolname='description']")
    private WebElement aboutContactInputField;

    @FindBy(css = "button.btn-primary.submit-btn-ec")
    private WebElement saveButton;

    @FindBy(css = "div.toast-body")
    private WebElement confirmMessage;


//    public boolean contactsPageIsDisplayed(){
//        try {
//            contsctsPage.isDisplayed();
//            return true;
//        }
//        catch (NoSuchElementExeption e){
//            return false;
//        }
//    }
}
