import java.util.Arrays;

class palindrome{



    public static void main(String[] args) {

        String s="malayalam";
        char[] s1=s.toCharArray();
        char[] s2=new char[s.length()];
        int j=0;
        for(int i=s1.length-1;i>0;i--){
            s2[j]=s1[i];
            j++;
        }
        if(Arrays.equals(s1,s2)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}