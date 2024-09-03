import java.util.Scanner;
class practice2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean asmile=s.nextBoolean();
        boolean bsmile=s.nextBoolean();
        if(asmile&&bsmile){
            System.out.println("no trouble");
            System.out.println("false");
        }
        else{
            System.out.println("trouble");
            System.out.println("true");
        }


    }
}