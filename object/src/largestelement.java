import java.util.Scanner;
class largestelement{
    public static void main(String[] args) {
        int[]a={10,57,89,90,10,45};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }

}