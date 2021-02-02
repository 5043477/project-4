//imput your package for your scanner here
import java.util.Scanner;

//then put your class name
public class Main {
  public static void main(String[] args) 
  {
    //here put scanner 
    Scanner scan = new Scanner(System.in);
//create your values here
    System.out.println("what school do you go to?");
    String school = scan.next();
    System.out.println("what year are whe in right now?");
    int currentYear = scan.nextInt();
    System.out.println("what year were you born in? ");
    int birthYear = scan.nextInt();
  //print your message here
    int age = getAge(birthYear, currentYear);
    System.out.println("this is your age " + age + " for the current year" + "and you go to school at " + school);
    
  }

//getAge method calculates getAge
static int getAge(int birthYear, int currentYear)
 {
int age = currentYear - birthYear;
return age;
 }

 //school method 
 static String greeting(String school)
 {
  String hello = "your school name is " + school;
  return hello;
 }
}