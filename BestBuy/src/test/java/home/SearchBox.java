package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class SearchBox extends CommonAPI {

  @Test
  public void search() {
      Set<String> ids=driver.getWindowHandles ();
      Iterator<String>it=ids.iterator ();
      String homePage = it.next ();
      String popup = it.next ();
      driver.switchTo ().window(popup);
}
}
