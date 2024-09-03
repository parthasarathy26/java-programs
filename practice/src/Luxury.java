
import java.util.Scanner;

class Luxury extends Cab{

}
class test1{
    public static void main(String[] args) {
        Mini m1=new Mini();
        Sedan s1=new Sedan();
        Luxury l1=new Luxury();
        System.out.println(m1);
        System.out.println(s1);
        System.out.println(l1);
        Cab c1= new Mini();
        Cab c2=new Sedan();
        Cab c3=new Luxury();
        System.out.println("cab ref:"+c1);
        System.out.println("cab ref:"+c2);
        System.out.println("cab ref:"+c3);
    }
}
