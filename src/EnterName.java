
import java.util.Scanner;

public class EnterName {

Scanner scanner = new Scanner(System.in);
    

public void entername(){
    String name;
    System.out.println("Enter your name"); 
    name = scanner.nextLine();
    System.out.println("Your name is" + name);
}

public void enterAge(){
    int age;

        System.out.println("Enter your age"); 
    try {
        age = scanner.nextInt();
        System.out.println("Your name is" + age);
    } catch (Exception e) {
        System.out.println("You can only enter numbers");
    } 
    
    }

}
