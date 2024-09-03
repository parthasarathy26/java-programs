import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int store = num;
        int rev = 0;
        while (num > 0){
            int a = num % 10;
            rev = rev * 10 + a;
            num = num / 10;
        }
        if (rev == store){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }


    }
}