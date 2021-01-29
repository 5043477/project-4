import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("what school do you got to?");
    String name = scan.next();
    System.out.println("what year are whe in right now?");
    int currentYear = scan.nextInt();
    System.out.println("when is your birthday?");
    int birthyear = scan.next();
  
    int age = getAge(birthYear, currentYear);
    System.out.println("this is your age for this current year." + age);
  }

//getAge method calculates getAge
static int getAge(int birthYear, int currentYear)
 {
int age = currentYear - birthYear;
return age;
 }

 //greeting method returns a personalized greeting
 static String greeting(String name)
 {
  String hello = "hello. welcome back, " + name;
  return hello;
 }
}