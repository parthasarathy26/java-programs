import java.util.Scanner;


    class test2 {
        public static void main(String[] args) {
            System.out.println("SELECT A CAB");
            System.out.println("PRESS 1 FOR MINI");
            System.out.println("PRESS 2 FOR SEDAN");
            System.out.println("PRESS 3 FOR LUXURY");
            System.out.println("ENTER THE CHOICE");
            Scanner S1 = new Scanner(System.in);
            int choice = S1.nextInt();
            Cab c1=null;
            switch (choice) {
                case 1: {
                   c1= new Mini();
                   // System.out.println("you selected MINI");
                }
                break;
                case 2: {
                   c1= new Sedan();
                    //System.out.println("you selected SEDAN");
                }
                break;
                case 3: {
                   c1= new Luxury();
                    //System.out.println("you selected LUXURY");
                }
                break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println(c1);
        }
    }