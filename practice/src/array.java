class array{
    public static void main(String[] args) {
        int[]a={1,2,9};
        int[]b={9,1,2,3};
        int[]c={13,6,9,2,3};
        if(a[0]==9||a[a.length-1]==9){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(b[0]==9||b[b.length-1]==9){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(c[0]==9 ||c[c.length-1]==9){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}