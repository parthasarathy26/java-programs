import java.util.Scanner;
public class ROUGH
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1.integers");
        System.out.println("2.long");
        System.out.println("3.string");
        System.out.println("ENTER UR CHOICE:");
        int a=s.nextInt();
        if (a==1)
            demo(1);
        else if (a==2)
            demo1('c');
        else if (a==3)
            demo2("hi");
    }
    static void demo(int a)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st value:");
        int z=s.nextInt();
        System.out.println("Enter the 2nd vlaue:");
        int y=s.nextInt();
        while(true) {
            System.out.println("VALUE="+ z+y);
            break;
        }
    }
    static void demo1(char a)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st charecter:");
        long z=s.nextLong();
        System.out.println("Enter the 2nd charecter:");
        long y=s.nextLong();
        switch (a)
        {
            case 1:
                System.out.println("VALUE="+ z+y);
                break;
            case 2:
                System.out.println("VALUE="+ z*y);
                break;
            case 3:
                System.out.println("VALUE="+ z/y);
                break;
            default :
                System.out.println("INVALID OPTION");
                break;
        }
    }
    static void demo2(String a)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st charecter:");
        String z=s.nextLine();
        System.out.println("Enter the 2nd charecter:");
        String y=s.next();
        switch (a)
        {
            case "1":
                System.out.println("VALUE="+ z+y);
                break;
            default :
                System.out.println("INVALID OPTION");
        }
    }
}