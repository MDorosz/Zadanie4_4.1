/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {

    int opcja;
    System.out.println("Wybierz opcje:");
    System.out.println("1-Dodawanie nowego studenta");
    System.out.println("2-Wypisanie studentów");
    System.out.println("0-Wyjscie");

    Scanner liczba = new Scanner(System.in);
    opcja = liczba.nextInt();
    Scanner name = new Scanner(System.in);
    Scanner age = new Scanner(System.in);

    switch (opcja)  {

      case 0: System.exit(0);

      case 1: 
      System.out.println("Podaj imie:");
      String n = name.nextLine();
      System.out.println("Podaj wiek:");
      int a = age.nextInt();
      
      try {
        Service s = new Service();
        s.addStudent(new Student(n, a));
        
      }
        catch (IOException e) {
          
        }
        break;
    }
  }
}
  