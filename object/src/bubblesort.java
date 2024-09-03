import java.util.Arrays;

class bubblesort{
    public static void main(String[] args) {
        int []arr={7,12,9,11,3};
        int temp;
        for(int j=arr.length;j>0;j--){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}