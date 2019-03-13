package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.wd.findElement(By.id("container")).click();
    app.gotoGroupPage();
    app.initGroupCreation("new");
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }


}
