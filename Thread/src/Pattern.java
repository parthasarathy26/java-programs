

import java.util.Scanner;



 class pattern {

    public static void main(String[]args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter no of lines(N):");

        int N=s.nextInt();



        for(int i=1;i<=N;i++) {

            for(int j=1;j<=(N-i);j++) {

                System.out.print(" ");





            }

            for(int k=1;k<=i;k++) {

                System.out.print("#");

            }

            System.out.println();

        }

        s.close();

    }



}