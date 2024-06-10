import java.util.ArrayList;
import java.util.Iterator;

public class Loops {
    

    ArrayList<String> myArrayList = new ArrayList<>();

    ArrayList<Integer> myIntList = new ArrayList<>();

    ArrayList<Integer> myIteratorList = new ArrayList<>();

    ArrayList<Integer> myLambdaList = new ArrayList<>();

    //For loop for array
    public void forLoop(){
        myIntList.add(1);
        myIntList.add(2);

        for (Integer i = 0; i < myIntList.size(); i ++){
            System.out.println(myIntList.get(i));
        }
    }

    //Foreach loop
    public void foreachLoop( ){
    myArrayList.add("Steffen");
    myArrayList.add("Ivar");

    for (String names : myArrayList)
        System.out.println(names);
    }

    //Iterator loop
    public void iteratorLoop(){
    myIteratorList.add(4);
    myIteratorList.add(8);

    Iterator i = myIteratorList.iterator();

    while (i.hasNext()) {
        System.out.println(i.next() + " ");
    }
}

    //Lambda loop
    public void lambdaLoop(){
        myLambdaList.add(11);
        myLambdaList.add(12);

        myLambdaList.forEach(myLambdaList->System.out.println(myLambdaList));
    }
    
}