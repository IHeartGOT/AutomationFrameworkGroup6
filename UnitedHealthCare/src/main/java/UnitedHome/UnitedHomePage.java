package UnitedHome;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UnitedHomePage extends CommonAPI {
  By Logo= By.xpath("//img[@class='uhc-logo desktop-logo']");
  By SearchBox =By.cssSelector("#q");
  By SearchButton =By.cssSelector(".search-button");
  By ProvidersLink =By.xpath("//a[@href='https://www.uhcprovider.com/' and @class='at-element-click-tracking']");
  By BrokersLink=By.xpath("//a[@href='https://www.uhc.com/broker'  and @class='at-element-click-tracking']");
  By LanguageLink=By.cssSelector(".english-link lang-toggle");
  By SignInLink = By.id("loginmenubutton");

  public WebElement Logolink(){
      return driver.findElement(Logo);
  }
  public WebElement testSearchBox(){
      return driver.findElement(SearchBox);
  }public WebElement clickOnSearchButon(){
      return driver.findElement(SearchButton);
    }
  public WebElement clickOnProvider(){
      return driver.findElement(ProvidersLink);
  }
  public WebElement clickOnBrokerLink(){
      return driver.findElement(BrokersLink);
  }
  public WebElement clickOnEspanol(){
      return driver.findElement(LanguageLink);
  }
  public WebElement clickOnSignIn(){
      return driver.findElement(SignInLink);
  }
}

