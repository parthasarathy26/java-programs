class secondarray{
    public static void main(String[] args) {
        int[]a={10,57,89,90,10,45};
        int max=0;
        int second=0;
        for(int i=0; i<a.length;i++){
            if(a[i]>max){
                second=max;
                max=a[i];
            }
        }
        System.out.println(second);
        System.out.println(max);

    }
}