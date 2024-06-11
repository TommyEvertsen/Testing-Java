
import java.util.ArrayList;

public class Programmer {

    private String name;
    private int age;
    private ArrayList<String> languages;

    public Programmer() {
        this.languages = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void addLanguages(String language){
     this.languages.add(language);
    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void brag(){
        System.out.println("Yo man i know all these languages" + getLanguages());
    }
    
}
