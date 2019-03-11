package ru.stqa.pft.addressbook;

public class ContactsData {
  private final String email;
  private final String telephone;
  private final String address;
  private final String nickname;
  private final String lastname;
  private final String middlename;
  private final String firstname;

  public ContactsData(String email, String telephone, String address, String nickname, String lastname, String middlename, String firstname) {
    this.email = email;
    this.telephone = telephone;
    this.address = address;
    this.nickname = nickname;
    this.lastname = lastname;
    this.middlename = middlename;
    this.firstname = firstname;
  }

  public String getEmail() {
    return email;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getAddress() {
    return address;
  }

  public String getNickname() {
    return nickname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getFirstname() {
    return firstname;
  }
}
