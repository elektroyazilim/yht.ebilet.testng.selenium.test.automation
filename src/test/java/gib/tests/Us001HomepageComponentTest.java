package gib.tests;

import gib.pages.PomManager;
import gib.utils.BrowserUtils;
import gib.utils.Config;
import gib.utils.DateUtils;
import gib.utils.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us001HomepageComponentTest extends PomManager {

    /**
     * TC001_Homepage, component validation testleri
     * --------------------------------------------
     * 1	Kullanıcı yht ebilet sitesini açar : https://ebilet.tcddtasimacilik.gov.tr/
     * 2	Yht sitesinde olduğunu doğrular - security test -
     * 3	Yht logosunun geldiğini doğrular
     * 4	Nereye Gitmek İstersiniz? başlığının olduğunu doğrular
     * 5	Turuncu Yardım Masası butonunun visible ve enable olduğunu doğrular
     * 6	Bilet Al menüsünün visible ve enable olduğunu doğrular
     * 7	Bilet Al linkinin "homepage" e navigate olduğunu doğrular
     * 8	İstasyon-Tren Danışma menüsünün visible ve enable olduğunu doğrular
     * 9	Çözüm Merkezi menüsünün visible ve enable olduğunu doğrular
     * 10	Engelsiz Ulaşım menüsünün visible ve enable olduğunu doğrular
     * 11	İletişim menüsünün visible ve enable olduğunu doğrular
     * 12	Üye Girişi butonunun visible ve enable olduğunu doğrular
     * 13	Dil ikonunun visible olduğunu doğrular
     * 14	Dil ikonunda "TR" olduğunu doğrular
     * 15	TR ikonuna tıklar
     * 16	Açılan panelde "Türkçe" ve "English" seçeneklerinin olduğunu doğrular
     * 17	Hamburger menüsünün visible ve enable olduğunu doğrular
     * 18	Hamburger menüsüne tıklar
     * 19	Bilet Al menüsünün visible ve enable olduğunu doğrular
     * 20	Bilet Al linkinin "homepage" e navigate olduğunu doğrular
     * 21	İstasyon-Tren Danışma menüsünün visible ve enable olduğunu doğrular
     * 22	Çözüm Merkezi menüsünün visible ve enable olduğunu doğrular
     * 23	Engelsiz Ulaşım menüsünün visible ve enable olduğunu doğrular
     * 24	İletişim menüsünün visible ve enable olduğunu doğrular
     * 25	Üye Girişi butonunun visible ve enable olduğunu doğrular
     * 26	Yolcu Hakları menüsünün visible ve enable olduğunu doğrular
     * 27	Yolcu Taşıma Kuralları menüsünün visible ve enable olduğunu doğrular
     * 28	Turuncu Masa Yardım Talep Formu  menüsünün visible ve enable olduğunu doğrular
     * 29	WhatsApp Hattı butonunun visible ve clickable olduğunu doğrular
     * 30	Çağrı Merkezi butonunun visible ve clickable olduğunu doğrular
     * 31	Hamburger menüyü kapatır
     * 32	Panelin kapandığını doğrular
     * ----------------------------------
     */
    @Test
    public void tc001HomepageMenuComponentValidationTest() {
        String homepageUrl = Config.getProperty("baseurl");
        Driver.getDriver().get(homepageUrl);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(homepageUrl));
        Assert.assertTrue(getHomePage().getYhtLogo().isDisplayed(), "Yht Logosu gozukmuyor");
        Assert.assertTrue(getHomePage().getLblNereyeGitmekIstersiniz().isDisplayed(), "Nereye gözükmüyor");
        // TODO: Geriye kalan stepler odev olarak verildi

    }

    /**
     * TC002_Bilet Al, component validation testleri
     * ------------------------------------------
     * 1	Bilet Al tab ının aktif tab olduğunu doğrular // getAttribute, class active
     * 2	Biletlerim tab'ının var olduğunu doğrular
     * 3	Tek Yön ikonunun seçili geldiğini doğrular
     * 4	Gidiş - Dönüş etiketinin olduğunu doğrular
     * 5	Gidiş - Dönüş ikonunun pasif olduğunu doğrular
     * 6	Nereden textbox'ının enable olduğunu doğrular
     * 7	Nereye textbox'ının disable olduğunu doğrular
     * 8	Dönüş Ekle butonunun olduğunu doğrular
     * 9	Gidiş - Dönüş ikonuna tıklar
     * 10	Dönüş Ekle butonunun olduğu yerde "Dönüş Tarihi" alanının açıldığını doğrular
     * 11	Sefer Ara butonunun visible ve enable olduğunu doğrular
     * 12	Sefer Ara butonuna tıklar
     * 13	Nereden textbox'ının altında "Tren kalkış alanı gereklidir" validation mesajının var olduğunu doğrular
     * 14	Gidiş Tarihi date elementinin altında "Lütfen tarih seçiniz." validation mesajının olduğunu doğrular
     * 15	Nereye giriş alanına tıklar
     * 16	Lütfen öncelikle kalkış istasyonunu seçiniz pop-up mesajının çıktığını doğrular
     * 17	Çıkan pop-up mesajı kapatır.
     * 18	Tek Yön ikonuna tıklar
     * 19	Gidiş Tarihi alanında bugünün tarihi olduğunu doğrular
     * 20	Date elementinin üstünde "Bugün, Yarın, Aynı Gün, Sonraki Gün" etiketlerinin varlığını ve tıklanabilir olduğunu doğrular
     * 21	Yarın linkine tıklar
     * 22	Gidiş Tarihi alanına yarının geldiğini doğrular
     * 23	Aynı Gün linkine tıklar
     * 24	Gidiş- Dönüş alanının aktif olduğunu doğrular
     * 25	Dönüş Tarihi alanının visible olduğunu doğrular
     * 26	Dönüş Tarihi alanında bugünün tarihi olduğunu doğrular
     * 27	Sonraki Gün linkine tıklar
     * 28	Dönüş Tarihi alanında yarının tarihi olduğunu doğrular
     * 29	Yolcu Sayısı combobox'ının enable olduğunu doğrular
     * 30	Yolcu Sayısı combobox'ının default değerinin "1 Yolcu" olduğunu doğrular
     * 31	Biletlerim tab'ına tıklar
     * 32	Bilet/Rezervasyon label'ının var olduğunu ve radio butonun selected olduğunu doğrular
     * 33	Açık Biletlerim radio butonun var olduğunu ve unselected olduğunu doğrular
     * 34	PNR No alanın var olduğunu ve enable olduğunu doğrular
     * 35	Soyad alanının var olduğunu ve enable olduğunu doğrular
     * 36	Sorgula butonunun visible ve enable olduğunu doğrular
     * 37	Sorgula butonuna tıklar
     * 38	Lütfen pnr no'yu kontrol ediniz. validation mesajının çıktığını doğrular
     * 39	Açık Biletlerim radio butonunu seçer
     * 40	Kupon No alanının visible ve enable olduğunu doğrular
     * 41	Soyad textbox'ının enable ve visible olduğunu doğrular
     */
    @Test
    public void tc002BiletAlComponentValidation() throws InterruptedException {
        Driver.getDriver().get(Config.getProperty("baseurl"));
        // Bilet Al tab ının aktif tab olduğunu doğrular
        Assert.assertTrue(getHomePage().isTabActive(getHomePage().getBiletAlTab()));
        // Biletlerim tab'ının var olduğunu doğrular
        Assert.assertTrue(getHomePage().getBiletlerimTab().isDisplayed());
        // Tek Yön ikonunun seçili geldiğini doğrular
        Assert.assertTrue(getHomePage().isCheckedDirectionIcon(getHomePage().getTekYonIcon()));
        // Gidiş - Dönüş etiketinin olduğunu doğrular
        Assert.assertTrue(getHomePage().getCiftYonLabel().isDisplayed());
        // Gidiş - Dönüş ikonunun pasif olduğunu doğrular
        Assert.assertFalse(getHomePage().getCiftYonIcon().isSelected());
        // Nereden textbox'ının enable olduğunu doğrular
        Assert.assertTrue(getHomePage().getTxtNereden().isEnabled());
        // Nereye textbox'ının disable olduğunu doğrular
        Assert.assertTrue(getHomePage().isElementReadonly(getHomePage().getTxtNereye()));
        // Dönüş Ekle butonunun olduğunu doğrular
        Assert.assertTrue(getHomePage().getBtnDonusEkle().isDisplayed());
        // Gidiş - Dönüş ikonuna tıklar,
        getHomePage().clickGidisDonusBtn();
        // Dönüş Ekle butonunun olduğu yerde "Dönüş Tarihi" alanının açıldığını doğrular
        Assert.assertTrue(getHomePage().getDateDonusTarihiElement().isDisplayed());
        // Sefer Ara butonunun visible ve enable olduğunu doğrular
        Assert.assertTrue(getHomePage().getBtnSeferArama().isDisplayed() && getHomePage().getBtnSeferArama().isEnabled());
        // Sefer Ara butonuna tıklar
        getHomePage().clickSeferAraBtn();
        // Nereden textbox'ının altında "Tren kalkış alanı gereklidir" validation mesajının var olduğunu doğrular
        Assert.assertTrue(getHomePage().getTrenKalkisAlaniGereklidirValMessageText().contains("Tren kalkış alanı gereklidir"));
        // Gidiş Tarihi date elementinin altında "Lütfen tarih seçiniz." validation mesajının olduğunu doğrular
        Assert.assertTrue(getHomePage().getLutfenTarihSecinizValMessageText().contains("tarih seçiniz"));
        // Nereye giriş alanına tıklar
        getHomePage().clickTxtNereye();
        // Lütfen öncelikle kalkış istasyonunu seçiniz pop-up mesajının çıktığını doğrular
        Assert.assertTrue(getHomePage().getAlertText().contains("öncelikle kalkış istasyonunu seçiniz"));

        getHomePage()
                .clickClosePopupAlert() // Çıkan pop-up mesajı kapatır.
                .clikTekYonBtn();       // Tek Yön ikonuna tıklar
        // Gidiş Tarihi alanında bugünün tarihi olduğunu doğrular
        Assert.assertEquals(DateUtils.getTodayDate(), getHomePage().getDateGidisTarihi());

        /**
         * Date elementinin üstünde "Bugün, Yarın, Aynı Gün, Sonraki Gün" etiketlerinin varlığını ve
         * tıklanabilir olduğunu doğrular
         */
        Assert.assertTrue(getHomePage().getBugunLink().isEnabled() && getHomePage().getBugunLink().isDisplayed());
        Assert.assertTrue(getHomePage().getYarinLink().isEnabled() && getHomePage().getYarinLink().isDisplayed());
        Assert.assertTrue(getHomePage().getAyniGunLink().isEnabled() && getHomePage().getAyniGunLink().isDisplayed());
        Assert.assertTrue(getHomePage().getSonrakiGunLink().isEnabled() && getHomePage().getSonrakiGunLink().isDisplayed());

        // Yarın linkine tıklar
        getHomePage().clickYarinLink();
        // Gidiş Tarihi alanına yarının geldiğini doğrular
        Assert.assertEquals(DateUtils.getDateAfterDays(1), getHomePage().getDateGidisTarihi());
        // Aynı Gün linkine tıklar
        getHomePage().clickAyniGunLink();
        // Dönüş Tarihi alanında yarının tarihi olduğunu doğrular
        Assert.assertEquals(DateUtils.getDateAfterDays(1), getHomePage().getDateDonusTarihi());
        // Sonraki Gün linkine tıklar
        getHomePage().clickSonrakiGunLink();
        // Dönüş Tarihi alanında ertesi gunun tarihi olduğunu doğrular
        Assert.assertEquals(DateUtils.getDateAfterDays(2), getHomePage().getDateDonusTarihi());

        // Yolcu Sayısı combobox'ının enable olduğunu doğrular
        Assert.assertTrue(getHomePage().getCbbYolcuSayisi().isEnabled());
        // Yolcu Sayısı combobox'ının default değerinin "1 Yolcu" olduğunu doğrular
        Assert.assertEquals(getHomePage().getYolcuSayisi(), "1 Yolcu");

        /**
         * 33	Açık Biletlerim radio butonun var olduğunu ve unselected olduğunu doğrular
         * 34	PNR No alanın var olduğunu ve enable olduğunu doğrular
         * 35	Soyad alanının var olduğunu ve enable olduğunu doğrular
         * 36	Sorgula butonunun visible ve enable olduğunu doğrular
         * 37	Sorgula butonuna tıklar
         * 38	Lütfen pnr no'yu kontrol ediniz. validation mesajının çıktığını doğrular
         * 39	Açık Biletlerim radio butonunu seçer
         * 40	Kupon No alanının visible ve enable olduğunu doğrular
         * 41	Soyad textbox'ının enable ve visible olduğunu doğrular
         */

        // Biletlerim tab'ına tıklar
        getHomePage()
                .clickBiletlerimTab();
        // Bilet/Rezervasyon label'ının var olduğunu doğrular
        Assert.assertTrue(getHomePage().getBiletRezevasyonLabel().isDisplayed());
        // Radio butonun selected olduğunu doğrular
        Assert.assertTrue(getHomePage().isRadioBtnSelected(getHomePage().getRezervasyonRadioBtn()));


    }
}