import java.util.Scanner;

import java.util.Arrays;

class bubblesort{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[s.nextInt()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }
            for(int i=arr.length;i>0;i--){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}