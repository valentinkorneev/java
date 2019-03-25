package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  @Test

  public void testContactDeletion(){
    app.getContactHelper().goToContacts();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getSessionHelper().logout();
  }
}
