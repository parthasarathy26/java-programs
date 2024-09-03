import java.util.Scanner;

class persondaily{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int steps= s.nextInt();
        if(steps<5000){
            System.out.println("sedentary");
        }
        else if(steps <=5000 && steps<=7499){
            System.out.println("low active" );
        }
        else if(steps<=7500 && steps<=9999){
            System.out.println("some what active");
        }
        else if(steps<=10000 &&steps<=12499){
            System.out.println("active");
        }
        else {
            System.out.println("highly active");
        }

        }
}