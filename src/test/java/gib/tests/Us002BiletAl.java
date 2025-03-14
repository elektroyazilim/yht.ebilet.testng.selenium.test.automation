package gib.tests;

import gib.pages.HomePage;
import gib.utils.Driver;
import org.testng.annotations.Test;

public class Us002BiletAl extends HomePage {

    @Test
    public void tc001BiletAlHomepage()
    {
        Driver.getDriver().get("https://ebilet.tcddtasimacilik.gov.tr/");
        clickTxtNereden();
    }
}
