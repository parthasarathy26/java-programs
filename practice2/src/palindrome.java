
class palindrome {
    public static void main(String[] args) {
        int b = 27;
        int count=0;
        for(int i=2;i<=b/2;i++){//optimization off the value /2
            if(b%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
