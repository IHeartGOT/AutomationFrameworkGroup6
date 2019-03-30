package Home;

import base.CommonAPI;
import org.omg.CORBA.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    @Test
    public void Test1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "cnn.com: Breaking news, Latest news and Videos ");
    }


    @Test
    public void USLink() {
        clickOnCss("#nav > div.nav__container > div.nav-menu-links > a:nth-child(1)");
    }

    @Test
    public void Worldlink() {
        clickOnCss("#nav > div.nav__container > div.nav-menu-links > a:nth-child(2)");
    }

    @Test
    public void Politicslink() throws Exception {
        driver.findElement(By.cssSelector("#nav > div.nav__container > div.nav-menu-links > a:nth-child(3)"));
        Thread.sleep(5000);
    }

    @Test
    public void Businesslink() {
        driver.findElement(By.cssSelector("#nav > div.nav__container > div.nav-menu-links > a:nth-child(4)"));
    }

    @Test
    public void Opinionlink() {
        driver.findElement(By.cssSelector("#nav > div.nav__container > div.nav-menu-links > a:nth-child(5)"));
    }

    @Test
    public void Healthlink() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[6]"));

    }

    @Test
    public void Environmentlink() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[7]"));
    }

    @Test
    public void Stylelink() {
        driver.findElement(By.cssSelector("#nav > div.nav__container > div.nav-menu-links > a:nth-child(8)"));
    }

    @Test
    public void Travellink() {
        driver.findElement(By.cssSelector("#nav > div.nav__container > div.nav-menu-links > a:nth-child(9)"));
    }

    @Test
    public void Sportslink() {
        WebElement classtest = driver.findElement(By.className("nav-menu-links__link"));
    }

    @Test
    public void videolink() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[11]"));
    }

    @Test
    public void LiveTvlink() {
        driver.findElement(By.cssSelector("#nav-mobileTV"));
    }

    @Test
    public void USEditionlink() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[3]/div[1]"));
    }

    @Test
    public void Searchlink() {
        driver.findElement(By.id("search-button"));
    }

    @Test
    public void CnnLogolink() {
        driver.findElement(By.className("nav__logo"));
    }

    /*@Test
    public void CnnAfricalink() {
        driver.findElement(By.cssSelector("#nav-section-submenu > a:nth-child(1)"));

        }
        @Test
    public void Americaslink(){
        driver.findElement(By.cssSelector("#nav-section-submenu > a:nth-child(2)"));*//*
        }*/
    @Test
    public void menubarlink() {
        driver.findElement(By.className("nav-menu__hamburger"));
    }

    @Test
    public void ussubcrimenjusticelink() {
        driver.findElement(By.className("m-footer__link"));
    }

    @Test
    public void usEmEvnrlink() {
        driver.findElement(By.xpath("/html/body/footer/div[2]/div/div[1]/ol[2]/li/ol/li[2]/a"));
    }

    @Test
    public void extremeweatherlink() {
        driver.findElement(By.xpath("/html/body/footer/div[2]/div/div[1]/ol[2]/li/ol/li[3]/a"));
    }

    @Test
    public void TodayinPoliticslink() {
        driver.findElement(By.xpath("//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[2]/ul/h2"));
    }

    @Test
    public void TopStorieslink() {
        driver.findElement(By.cssSelector("#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-2 > ul > h2"));

    }

    @Test
    public void newsandbuzzlink() throws Exception {
        driver.findElement(By.cssSelector("#homepage2-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul > h2"));
        Thread.sleep(5000);
    }

    @Test
    public void yourhealth() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"homepage2-zone-1\"]/div[2]/div/div[2]/ul/h2"));
        Thread.sleep(3000);
    }

    @Test
    public void foodndrinklink() {
        driver.findElement(By.cssSelector("#homepage2-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-3 > ul > h2"));
    }

    @Test
    public void checkthisoutlink() {
        driver.findElement(By.xpath("//*[@id=\"homepage2-zone-1\"]/div[2]/div/div[5]/div/h2"));
    }

    @Test
    public void Cnnbusiness() {
        driver.findElement(By.cssSelector("#homepage2-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-5 > ul > a > h2"));
    }

    @Test
    public void sportslink() {
        driver.findElement(By.xpath("//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[1]/ul/a/h2"));
    }

    @Test
    public void opinionlink() {
        driver.findElement(By.cssSelector("#homepage3-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-1 > ul > a > h2"));
    }

    @Test
    public void stylelink() {
        driver.findElement(By.xpath("//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[6]/ul/a/h2"));

    }

    @Test
    public void Entertainmentlink() {
        driver.findElement(By.xpath("//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[7]/ul/a/h2"));
    }

    @Test
    public void Techlink() throws Exception {
        driver.findElement(By.cssSelector("#homepage3-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-7 > ul > a > h2"));
        Thread.sleep(3000);
    }
    /*@Test
    public void NextPresidentialLink() {
        driver.findElement(By.linkText("The 2020 presidential race"));*/

    @Test
    public void cnnfilmndigitalLink() {
        driver.findElement(By.cssSelector("#homepage4-zone-3 > div.l-container.zn__background--content-relative > div.zn__containers > div.column.zn__column--idx-1 > ul > h2"));
    }

    @Test
    public void testTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "cnn.com: news agency");
    }

    @Test
    public void digitalStudiolink() {
        clickOnCss("#nav-section-submenu > a:nth-child(2)");
    }

    @Test
    public void cnnfilmlink() {
        driver.findElement(By.cssSelector("#nav-section-submenu > a:nth-child(3)"));

    }

    @Test
    public void HNLsublink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"nav-section-submenu\"]/a[4]"));
        Thread.sleep(5000);
    }

    @Test
    public void TvScheduleLink() {
        driver.findElements(By.cssSelector("#nav-section-submenu > a:nth-child(5)"));
    }

    @Test
    public void TVshowAZLink() {
        driver.findElement((By.cssSelector("#nav-section-submenu > a:nth-child(6)")));
    }

    @Test
    public void CNNVRlink() {
        clickOnCss("public void TVshowAZLink() {");
    }

    @Test

    public void destinationlink() {
        driver.findElement(By.xpath("//*[@id=\"mount\"]/div/div[1]/div[2]/div/div/div[2]/a[1]"));
    }

    @Test
    public void FoodandDrinklink() {
        driver.findElement(By.cssSelector("#mount > div > div.StickyTop__isStickyAd > div.Header__container.Header__isShown > div > div > div.Header__navigation > a:nth-child(2)"));
    }

    @Test
    public void playlink() {
        driver.findElement(By.id("google_ads_iframe_/8663477/CNN/travel/play/landing_0__container__"));
    }

    @Test
    public void NFLlink() throws Exception {
        driver.findElement(By.cssSelector("#nfl > a"));
        Thread.sleep(4000);
    }


}