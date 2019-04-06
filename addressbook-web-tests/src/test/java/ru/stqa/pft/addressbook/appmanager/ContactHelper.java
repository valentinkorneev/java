package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactHelper extends HelperBase {



  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactsData contactsData, boolean creation) {

    type(By.name("email"), contactsData.getEmail());
    type(By.name("home"), contactsData.getTelephone());
    type(By.name("address"), contactsData.getAddress());
    type(By.name("nickname"), contactsData.getNickname());
    type(By.name("lastname"), contactsData.getLastname());
    type(By.name("middlename"), contactsData.getMiddlename());
    type(By.name("firstname"), contactsData.getLastname());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactsData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }




  public void initContactModification() {
    click(By.cssSelector("a > img[title='Edit']"));
  }

  public void submitGroupModification() {
    click(By.xpath("//input[@value='Update']"));
  }


}
