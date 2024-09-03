import java.util.Scanner;

class practice1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of lines");
        int N=s.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=(N-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}