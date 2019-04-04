package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactCreationTests extends TestBase {



  @Test
  public void testContactCreation() throws Exception {


    app.getContactHelper().goToAddContacts();
    app.getContactHelper().fillContactForm(new ContactsData("jaredleto@thisisthehive.net", "+18885553535", "USA, California, Loss Angeles, The Hive", "jaja", "Leto", "Joseph", "Jared", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getSessionHelper().logout();
  }




}
