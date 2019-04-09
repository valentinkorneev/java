package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Collection {
  public static void main(String[] args) {
    String[] langs = new String[4];
    langs[0] = "java";
    langs[1] = "с++";
    langs[2] = "pascal";
    langs[3] = "php";

    List<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("C++");
    languages.add("Pascal");
    languages.add("PHP");

    for (String l : languages) {
      System.out.println("Язык программирования " + l);
    }

  }
}
