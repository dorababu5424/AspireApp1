package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements extends BaseClass {

    public PageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='login']")
    private WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement LoginButton;

    @FindBy(xpath = "//div[text()='Inventory']")
    private WebElement InventoryBtn;

    @FindBy(xpath = "(//a[@class='dropdown-toggle o-no-caret o_menu_header_lvl_1'])[2]")
    private WebElement MenuBtn;

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement ProductBtn;

    public WebElement getEmail() {
        return Email;
    }

    public void setEmail(WebElement email) {
        Email = email;
    }

    public WebElement getPassword() {
        return Password;
    }

    public void setPassword(WebElement password) {
        Password = password;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        LoginButton = loginButton;
    }

    public WebElement getInventoryBtn() {
        return InventoryBtn;
    }

    public void setInventoryBtn(WebElement inventoryBtn) {
        InventoryBtn = inventoryBtn;
    }

    public WebElement getMenuBtn() {
        return MenuBtn;
    }

    public void setMenuBtn(WebElement menuBtn) {
        MenuBtn = menuBtn;
    }

    public WebElement getProductBtn() {
        return ProductBtn;
    }

    public void setProductBtn(WebElement productBtn) {
        ProductBtn = productBtn;
    }

    public WebElement getProductClck() {
        return ProductClck;
    }

    public void setProductClck(WebElement productClck) {
        ProductClck = productClck;
    }

    public WebElement getProductName() {
        return ProductName;
    }

    public void setProductName(WebElement productName) {
        ProductName = productName;
    }

    public WebElement getProductSave() {
        return ProductSave;
    }

    public void setProductSave(WebElement productSave) {
        ProductSave = productSave;
    }

    public WebElement getApplicationClck() {
        return ApplicationClck;
    }

    public void setApplicationClck(WebElement applicationClck) {
        ApplicationClck = applicationClck;
    }

    public WebElement getManufacturingBtn() {
        return ManufacturingBtn;
    }

    public void setManufacturingBtn(WebElement manufacturingBtn) {
        ManufacturingBtn = manufacturingBtn;
    }

    public WebElement getMenuBtn2() {
        return MenuBtn2;
    }

    public void setMenuBtn2(WebElement menuBtn2) {
        MenuBtn2 = menuBtn2;
    }

    public WebElement getProductSend() {
        return ProductSend;
    }

    public void setProductSend(WebElement productSend) {
        ProductSend = productSend;
    }

    public WebElement getConfromBtn() {
        return ConfromBtn;
    }

    public void setConfromBtn(WebElement confromBtn) {
        ConfromBtn = confromBtn;
    }

    public WebElement getDoneBtn() {
        return DoneBtn;
    }

    public void setDoneBtn(WebElement doneBtn) {
        DoneBtn = doneBtn;
    }

    public WebElement getApplyBtn() {
        return ApplyBtn;
    }

    public void setApplyBtn(WebElement applyBtn) {
        ApplyBtn = applyBtn;
    }

    @FindBy(xpath = "//button[@class='btn btn-primary o-kanban-button-new']")
    private WebElement ProductClck;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    private WebElement ProductName;


    @FindBy(xpath = "//button[@class='btn btn-primary o_form_button_save']")
    private WebElement ProductSave;

    @FindBy(xpath = "//a[@title='Applications']")
    private WebElement ApplicationClck;

    @FindBy(xpath = "//div[text()='Manufacturing']")
    private WebElement ManufacturingBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary o_list_button_add']")
    private WebElement MenuBtn2;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    private WebElement ProductSend;

    @FindBy(xpath = "//span[text()='Confirm']")
    private WebElement ConfromBtn;

    @FindBy(xpath = "//span[text()='Mark as Done']")
    private WebElement DoneBtn;

    @FindBy(xpath = "//span[text()='Apply']")
    private WebElement ApplyBtn;
















}
