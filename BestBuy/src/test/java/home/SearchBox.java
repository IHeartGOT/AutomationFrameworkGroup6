package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchBox extends CommonAPI {

  @Test
  public void search() {
   typeOnID("gh-search-input", "games");
}
}
