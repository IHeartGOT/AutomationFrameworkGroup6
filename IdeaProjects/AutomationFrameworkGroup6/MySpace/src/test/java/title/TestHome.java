package title;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    /*@Test
    public void LoginInput() {
        clickOnCss("login.email");
        typeOnID("userid", "alexkarmokar");
        typeOnElementNEnter("pass", "abcd1234");
    }*/

    @Test
    public void MyspaceLogolink() throws Exception {
        driver.findElement(By.cssSelector("#unifiedSidebar > header > a > i"));
        Thread.sleep(4000);
    }

    @Test
    public void Searchlink() {
        driver.findElement(By.className("search svg")).sendKeys("Search");
    }

    @Test
    public void Featurelink() {
        driver.findElement(By.cssSelector(""));
    }

    @Test
    public void Musiclink() throws Exception {
        driver.findElement(By.xpath("//*[@id=/div[1]/nav/ul/li[2]/a/span"));
        Thread.sleep(3000);
    }

    @Test
    public void Videoslink() throws Exception {
        driver.findElement(By.xpath("'//a[@href='/discover/videos']"));
        Thread.sleep(3000);
    }

    /*@Test
    public void Peoplelink() {
        driver.findElement(By.cssSelector("#unifiedSidebar > div:nth-child(3) > nav > ul > li.people > a")).sendKeys("People");
    }*/

    @Test
    public void signuplink() throws Exception {
        driver.findElement(By.id("sign-up")).sendKeys("signup");
        Thread.sleep(3000);
    }

    @Test
    public void signinlink() {
        driver.findElement(By.cssSelector("#sign-in")).sendKeys("signin");
    }

    @Test
    public void newslink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.categories > li:nth-child(1) > a"));
    }

    @Test
    public void Artistoftheday() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[1]/li[2]/a"));
    }

    @Test
    public void QandAlink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.categories > li:nth-child(3) > a"));
    }

    @Test
    public void Everybodyloveslink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[1]/li[4]/a"));

    }

    @Test
    public void Topeightlink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.categories > li:nth-child(5) > a"));
    }

    @Test
    public void Portraits() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[1]/li[6]/a"));
    }

    @Test
    public void morelink() {
        driver.findElement(By.className("more-btn")).sendKeys("more");
    }

    @Test
    public void helplink() throws Exception {
        driver.findElement(By.xpath("//*[@id=footer_global]/span[1]/a")).sendKeys("help");

    }

    /*@Test
    public void searchprofilelink() {
        driver.findElement(By.className("profile-search")).sendKeys("searchprofile");
        ;*/


    @Test
    public void searchlink() {
        driver.findElement(By.xpath("//*[@id=people-browse-widget]/div[2]/form/footer/button"));

    }

    @Test
    public void siteinfo() {
        driver.findElement(By.className("#site-info")).sendKeys("siteinfo");
    }

    @Test
    public void Privacylink() {
        driver.findElement(By.xpath("//*[@id=footer_global]/span[3]/a"));
    }

    @Test
    public void Termslink() {
        driver.findElement(By.cssSelector("#footer_global > span:nth-child(5) > a"));
    }

    @Test
    public void Addoptoutlink() {
        driver.findElement(By.xpath("//*[@id=footer_global]")).sendKeys("Add-opt-out");
    }

    @Test
    public void Entertainmentlink() {
        driver.findElement(By.cssSelector("#footer_global > span.network"));
    }

    @Test
    public void discoverlink() {
        driver.findElement(By.xpath("//*[@id=unifiedSidebar]/div[1]/h2"));
    }

    @Test
    public void freelunchlink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.more-categories > li:nth-child(1) > a"));
    }

    @Test
    public void Tenthings() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[2]/a"));
    }

    @Test
    public void Profile() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.more-categories > li:nth-child(3) > a"));
    }

    @Test
    public void premierlink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[4]/a"));

    }

    @Test
    public void crowdsurfing() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.more-categories > li:nth-child(5) > a"));
    }

    @Test
    public void tatoosdaylink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[6]/a"));
    }

    @Test
    public void wresrlinglink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[7]/a"));
    }

    @Test
    public void mymusicfriday() {
        clickOnCss("#article-category-nav > ul.more-categories > li:nth-child(8) > a");
    }

    @Test
    public void myplaylistlink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[10]/a"));
    }

    @Test
    public void inmemoriumlink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.more-categories > li:nth-child(12) > a"));
    }

    @Test
    public void gallerylink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[13]/a"));
    }

    @Test
    public void twentyQueslink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.more-categories > li:nth-child(14) > a"));
    }

    @Test
    public void ThrowBackThursdayLink() {
        driver.findElement(By.cssSelector("#article-category-nav > ul.more-categories > li:nth-child(15) > a"));

    }

    @Test
    public void WhatYouMissLink() {
        driver.findElement(By.xpath("//*[@id=article-category-nav]/ul[2]/li[16]/a"));
    }
}