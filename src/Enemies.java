import java.util.Random;

public abstract class Enemies {
   private int attackPower;
   private int hp;
   private String name;
   public int feet;

    public int getAttackPower() {
    return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int Attack(){
        Random rand = new Random();
        int randomAttack = rand.nextInt(3); 
        return randomAttack + getAttackPower();
    }
   
    public void deathSound(){
        System.out.println("");
    }

   
   



}
