package gib.pages;

public class PomManager {

    private HomePage homePage;

    public HomePage getHomePage()
    {
        return homePage == null? new HomePage(): homePage;
    }
}
