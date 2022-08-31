import java.util.*;
import java.io.PrintWriter;
public class Main {

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);

    String name;
    System.out.print("Name: ");
    name = user_input.next();

    String surname;
    System.out.print("Surname: ");
    surname = user_input.next();

    String gender;
    System.out.print("Gender: ");
    gender = user_input.next();

    String dob;
    System.out.print("D.O.B: ");
    dob = user_input.next();

    String email;
    System.out.print("Email: ");
    email = user_input.next();

    String confirmation;
    System.out.print("You are: " + "" + name + "" + surname + ". Yes / No");
    confirmation = user_input.next();
    
    try {
      PrintWriter output = new PrintWriter("output.txt");

      output.print(name + " " + surname + " " + gender + " " + dob + " " + email + " " + " registered.");
      output.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
    System.out.flush();
  }
}

