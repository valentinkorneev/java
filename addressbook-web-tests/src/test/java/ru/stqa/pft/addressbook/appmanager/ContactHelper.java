package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {



  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {

    type(By.name("email"), contactData.getEmail());
    type(By.name("home"), contactData.getTelephone());
    type(By.name("address"), contactData.getAddress());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("firstname"), contactData.getLastname());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
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


  public void createContact(ContactData contact, boolean creation) {
    fillContactForm(contact, creation);
    submitContactCreation();
  }

  public boolean isThereAContact() {
    return (isElementPresent(By.name("selected[]")));
  }
}
