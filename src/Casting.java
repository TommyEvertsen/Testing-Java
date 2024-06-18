public class Casting {

   
    public void ImplicitCasting(){
        //byte -> sjort -> int -> long -> float -> double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
    }

    public void ExplicitCasting(){
        double x =  1.5;
        double y = 2.3;
        int total = (int) x + (int) y;
        System.out.println(total);
    }

    public void ParseCasting(){
        String x = "1";
        int y = Integer.parseInt(x);
        System.out.println(y);
    }


}
