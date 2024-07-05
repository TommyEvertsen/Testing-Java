import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        //Objects inheritance and polomorphism
        Enemies kattYes = new Cat();
        kattYes.setAttackPower(10);
        kattYes.setHp(10); 
        kattYes.setName("Simba");
        kattYes.feet = 4;
        System.out.println(kattYes.getName());
        System.out.println(kattYes.getHp());
        System.out.println(kattYes.Attack());
        kattYes.deathSound();

        Enemies Goh = new Dog();
        Goh.setAttackPower(70);
        System.out.println(Goh.Attack());
        Goh.deathSound();

        //Arrays and arraylists
         
        //Regular arrays cannot add elements they are fixed size
        String friendsArray[] = {"Steffen", "Ivar", "Kalven"};
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Stefen", "Ivar", "Kalven"));

        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        //Adding elements 
        //Cannot do it on array :( 
        friendsArrayList.add("Kalv");

        //Set an element
        friendsArray[1] = "Steffen";
        friendsArrayList.set(1, "Steffen");

        //Rmove an element
        //Cannot do it on array :( 
        friendsArrayList.remove(1);
        // Or
        friendsArrayList.remove("Steffen");

        //Print
        System.out.println(friendsArray);
        System.out.println(friendsArrayList);



        //ArrayList VS LinkedList
        //ArrayLists are better for finding things in them, Linkedlists are better for adding and removing items.
        ArrayList<String> carsArray = new ArrayList<>();
        LinkedList<String> carsLst = new LinkedList<>();



        //Using Enums
        DaysofTheWeek day = DaysofTheWeek.FRIDAY;

        if(day == DaysofTheWeek.FRIDAY){
            System.out.println("Friday yeeeah");
        }

       for (DaysofTheWeek allDays : DaysofTheWeek.values()) {
          System.out.println(allDays); 
       }

       System.out.println(Cereals.STRATCHER.levelOfDeliciousness); 



       //Hasmaps
       HashMap<String, Integer> employeeID = new HashMap<>();

       employeeID.put("Tommy", 1310);
       employeeID.put("Stratcher", 2611);
       employeeID.put("The old one", 131087329);

       System.out.println(employeeID);

       System.out.println(employeeID.get("Tommy")); 

       System.out.println(employeeID.containsKey("Stratcher"));
       System.out.println(employeeID.containsKey("Steffen"));

       System.out.println(employeeID.containsValue(1310));
       System.out.println(employeeID.containsValue(2544));



       //Exeption handling

       try {
       int myInt = Integer.parseInt("Stefen");
       }
       catch (Exception e) {
       System.out.println("Yo dude you cant do that, ");
       }
       finally{
        //This will always show if there is exeption or not
        System.out.println("This is from the finally block");
        Goh.deathSound();
       }


       //Scanner
        
       EnterName enterName = new EnterName();

       enterName.entername();
       enterName.enterAge();
 
       
       //Sets and hashsets
       //Almost the same as array list but cannot have duplicate entries
       Set<String> humans = new HashSet<>();
       
       humans.add("Kalvajegern");
       humans.add("Stratcher");
       humans.add("Stratcher");

       humans.remove("Kalvajegern");

       System.out.println(humans);

       //Cool way to remove duplicates from array lists - turn it into hashset
       ArrayList<String> humansList = new ArrayList<>();
       humansList.add("Steffen");
       humansList.add("Steffen");
       humansList.add("Tommy");
       System.out.println(humansList);

       Set<String> humansHashSet = new HashSet<>();
       humansHashSet.addAll(humansList);
       System.out.println(humansHashSet);

       ArrayAndLists list = new ArrayAndLists();
       list.addListItmes("Mygg");
       System.out.println(list.returnArray());
     
       
       //Diffrent loops in java
       Loops myLoops = new Loops();
       myLoops.foreachLoop();
       myLoops.forLoop();
       myLoops.iteratorLoop();
       myLoops.lambdaLoop();


       //Using getters and setter
       GettersAndSetters getAndSet = new GettersAndSetters();
       getAndSet.setName("Kalv");
       System.out.println(getAndSet.getName()); 

       //Time and date
       TimeAndDate time = new TimeAndDate();
       time.currentTime();
       time.currentTimeAndDate();
       time.dateFormatter();

       //Interface is like a blueprint, can add as many as we want to classes
       InterfaceShowcase rauram = new InterfaceClass();
       rauram.hide();
       rauram.run();

       //Casting
       Casting cast = new Casting();
       cast.ImplicitCasting();
       cast.ExplicitCasting();
       cast.ParseCasting();

       //Annotations
       JavaAnnotationsTestingClass annotationsClass = new JavaAnnotationsTestingClass("Kalv");
       if ( annotationsClass.getClass().isAnnotationPresent(JavaAnnotations.class)) {
       System.out.println("This class has annotations" + annotationsClass);
      } else {
        System.out.println("This class does not have annotations");
      }

     //Files
     try {
      File myFile = new File("filename.txt");
      if (myFile.createNewFile()) {
        System.out.println("File created: " + myFile.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }


     try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }


     try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }

  

  }
     
 
