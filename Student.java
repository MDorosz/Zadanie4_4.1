public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private String Adres;

  public Student(String name, String surname, int age, String adres) {
    Name = name;
    Surname = surname;
    Age = age;
    Adres = adres;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurname() {return Surname;}

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " " + Adres;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "", -1,"");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}