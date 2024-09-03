import java.util.Scanner;
class sarasan {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.println("enter the array");
        int[] res = new int[9];
        for (int i = 0; i < res.length; i++) {
            res[i] = array.nextInt();

        }
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i]);
        }
    }

    }