package gib.pages;

import gib.utils.BrowserUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "h1#testFlow")
    private WebElement lblNereyeGitmekIstersiniz;

    @FindBy(xpath = "//img[@alt='icon-turuncu-yardim-masasi']")
    private WebElement iconTuruncuMasa;

    @FindBy(xpath = "//div[contains(@class,'menu')]//a[contains(text(),'Bilet Al')]")
    private WebElement biletAlMenu;

    @FindBy(xpath = "//div[contains(@class,'fbody')]//a[@href='/']")
    private WebElement biletAlHamburgerMenu;

    @FindBy(xpath = "//div[contains(@class,'menu')]//a[contains(@href,'cozum-merkezi')]")
    private WebElement cozumMerkeziMenu;

    @FindBy(xpath = "//div[contains(@class,'menu')]//a[contains(@href,'engelsiz-ulasim')]")
    private WebElement engelsizUlasimMenu;

    @FindBy(xpath = "//div[contains(@class,'menu')]//a[contains(@href,'iletisim')]")
    private WebElement iletisimMenu;

    @FindBy(css = "button#btnLogin")
    private WebElement btnUyeGirisiOnMenu;

    @FindBy(css = "button.btn-lang")
    private WebElement languageIcon;

    @FindBy(css = "button.collapsed")
    private WebElement btnHamburgerMenu;

    @FindBy(css = "div.fbody")
    private WebElement hamburgerPanel;

    @FindBy(css = "div.content button.close")
    private WebElement btnHamburgerClose;

    @FindBy(xpath = "//header//img[contains(@alt,'tcdd-logo')]")
    private WebElement yhtLogo;

    @FindBy(id = "buyTicketTab")
    private WebElement biletAlTab;

    @FindBy(id = "ticketSearchTab")
    private WebElement biletlerimTab;

    @FindBy(xpath = "//span[@selenium-test='one-way']/../input")
    private WebElement tekYonIcon;

    @FindBy(xpath = "//span[@selenium-test='round-trip']/../input")
    private WebElement ciftYonIcon;

    @FindBy(xpath = "//span[@selenium-test='round-trip']/../span")
    private WebElement ciftYonLabel;

    @FindBy(css = "#fromTrainInput")
    private WebElement txtNereden;

    @FindBy(id = "toTrainInput")
    private WebElement txtNereye;

    @FindBy(css = ".btnAddReturn")
    private WebElement btnDonusEkle;

    @FindBy(xpath = "//input[@placeholder='Dönüş Tarihi']")
    private WebElement dateDonusTarihi;

    @FindBy(id = "searchSeferButton")
    private WebElement btnSeferArama;

    @FindBy(css = "div.whereFromDropdown .invalid-feedback-inline")
    private WebElement trenKalkisAlaniGereklidirValMessage;

    @FindBy(xpath = "//div[contains(@class,'dateInputArea')]/div[contains(@class,'invalid-feedback-inline')]")
    private WebElement lutfenTarihSecinizValMessage;

    @FindBy(xpath = "(//div[contains(@class,'alert')]//p)[2]")
    private WebElement alertMessage;

    @FindBy(xpath = "(//div[contains(@class,'alertPosition')]//button)[2]")
    private WebElement btnAlertX;

    @FindBy(xpath = "//input[@placeholder='GidişTarihi']")
    private WebElement dateGidisTarihi;

    @FindBy(css = "div.departureDate input")
    private WebElement isDate;

    @FindBy(xpath = "//div[contains(@class,'dateSelectionTextArea')]/button[text()='Bugün']")
    private WebElement bugunLink;

    @FindBy(xpath = "//div[contains(@class,'dateSelectionTextArea')]/button[text()='Yarın']")
    private WebElement yarinLink;

    @FindBy(xpath = "//div[contains(@class,'dateSelectionTextArea')]/button[text()='Aynı Gün']")
    private WebElement ayniGunLink;

    @FindBy(xpath = "//div[contains(@class,'dateSelectionTextArea')]/button[text()='Sonraki Gün']")
    private WebElement sonrakiGunLink;

    @FindBy(xpath = "//input[@selenium-test='passenger']//ancestor::div[@role='combobox']")
    private WebElement cbbYolcuSayisi;

    @FindBy(xpath = "//input[@selenium-test='passenger']")
    private WebElement txtYolcuSayisi;

    @FindBy(xpath = "//span[contains(text(),'Bilet/Rezervasyon')]")
    private WebElement biletRezevasyonLabel;

    @FindBy(xpath = "//span[contains(text(),'Rezervasyon')]/../input")
    private WebElement rezervasyonRadioBtn;


    public String getTrenKalkisAlaniGereklidirValMessageText()
    {
        return trenKalkisAlaniGereklidirValMessage.getText();
    }

    public String getLutfenTarihSecinizValMessageText()
    {
        return lutfenTarihSecinizValMessage.getText();
    }

    public WebElement getRezervasyonRadioBtn()
    {
        return  rezervasyonRadioBtn;
    }

    public boolean isRadioBtnSelected(WebElement element)
    {
        return Boolean.parseBoolean(element.getDomProperty("checked"));
    }

    public WebElement getBiletRezevasyonLabel() {
        BrowserUtils.waitForVisibilityOfElement(biletRezevasyonLabel);
        return biletRezevasyonLabel;
    }

    public WebElement getCbbYolcuSayisi() {
        return cbbYolcuSayisi;
    }

    public String getYolcuSayisi()
    {
        return txtYolcuSayisi.getDomProperty("value");
    }

    public String getDateDonusTarihi() {
        return dateDonusTarihi.getAttribute("value");
    }

    public WebElement getDateDonusTarihiElement() {
        return dateDonusTarihi;
    }

    public WebElement getBugunLink() {
        return bugunLink;
    }

    public WebElement getYarinLink() {
        return yarinLink;
    }

    public void clickYarinLink()
    {
        yarinLink.click();
    }

    public WebElement getAyniGunLink() {
        return ayniGunLink;
    }

    public void clickAyniGunLink()
    {
        ayniGunLink.click();
    }

    public WebElement getSonrakiGunLink() {
        return sonrakiGunLink;
    }

    public void clickSonrakiGunLink()
    {
        sonrakiGunLink.click();
    }

    public @Nullable String getDateGidisTarihi() {
        return isDate.getDomProperty("value");
    }

    public WebElement getTrenKalkisAlaniGereklidirValMessage() {
        return trenKalkisAlaniGereklidirValMessage;
    }

    public String getAlertText() {
        return alertMessage.getText();
    }

    public HomePage clickClosePopupAlert() {
        BrowserUtils.clickWithJS(btnAlertX);
        // btnAlertX.click();
        return this;
    }

    public void clikTekYonBtn() {
        tekYonIcon.click();
    }

    public HomePage clickSeferAraBtn() {
        if (btnSeferArama.isEnabled()) {
            btnSeferArama.click();
        }
        return this;
    }

    public void clickTxtNereden() {
        if (txtNereden.isEnabled()) {
            txtNereden.click();
        }
    }

    public void clickTxtNereye() {
        if (txtNereye.isEnabled()) {
            // txtNereye.click();
            BrowserUtils.clickWithJS(txtNereye);
        }
    }

    public WebElement getBtnSeferArama() {
        return btnSeferArama;
    }

    public WebElement getBtnDonusEkle() {
        return btnDonusEkle;
    }

    public void clickGidisDonusBtn() {
        if (ciftYonIcon.isEnabled()) {
            ciftYonIcon.click();
        }
    }

    public WebElement getTxtNereye() {
        return txtNereye;
    }

    public boolean isElementReadonly(WebElement element) {
        return Boolean.parseBoolean(element.getDomAttribute("readonly"));
    }


    public WebElement getCiftYonLabel() {
        return ciftYonLabel;
    }

    public WebElement getTxtNereden() {
        return txtNereden;
    }

    public WebElement getTekYonIcon() {
        return tekYonIcon;
    }

    public WebElement getCiftYonIcon() {
        return ciftYonIcon;
    }

    public boolean isCheckedDirectionIcon(WebElement radioElement) {
        return radioElement.isSelected();
    }


    public WebElement getBiletAlTab() {
        return biletAlTab;
    }


    public WebElement getBiletlerimTab() {
        return biletlerimTab;
    }

    public HomePage clickBiletlerimTab()
    {
        biletlerimTab.click();
        return this;
    }

    public boolean isTabActive(WebElement element) {
        return element.getDomAttribute("class").contains("active");
    }

    public WebElement getYhtLogo() {
        return yhtLogo;
    }

    public WebElement getLblNereyeGitmekIstersiniz() {
        return lblNereyeGitmekIstersiniz;
    }


}
