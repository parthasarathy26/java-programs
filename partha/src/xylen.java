
class xylen{
    public static void main(String[] args) {
        int n=1234;
        int outersum=n %10;
        n=n/10;
        int innersum=0;
        while(n>9){
            int last=n%10;
            innersum=innersum+last;
            n=n/10;
        }
        outersum = outersum +n;
        if(outersum==innersum){
            System.out.println("Xylennumber");
        }
        else {
            System.out.println("pholemenumber");    

        }

    }
}