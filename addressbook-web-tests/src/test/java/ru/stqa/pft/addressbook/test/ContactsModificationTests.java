package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactsModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToContacts();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().goToAddContacts();
      app.getContactHelper().createContact(new ContactData("jaredleto@thisisthehive.net", "+18885553535", "USA, California, Loss Angeles, The Hive", "jaja", "Leto", "Joseph", "Jared", "test1"), true);
      app.getNavigationHelper().goToContacts();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("jaredleto@thisisthehive.net", "+18885553535", "USA, California, Loss Angeles, The Hive", "jaja", "Leto", "Joseph", "Jared", null), false);
    app.getContactHelper().submitGroupModification();
  }
}
