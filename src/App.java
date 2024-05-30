import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class App {
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
    }
}