       //#####
       // ####
       // ###
        //##
        //#
import java.util.Scanner;
class practice2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=N;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }



    }
}