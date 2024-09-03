
import java.util.Scanner;
class healthmonitoring{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int systolicbp= s.nextInt();
        int diastolicbp=s.nextInt();
        if(systolicbp<90||diastolicbp<60){
            System.out.println("your blood pressure is low");
        }
        else if((systolicbp>=90&&systolicbp<=120)&&(diastolicbp>=60&&diastolicbp<=80)){
            System.out.println("your blood pressure is normal");
        }
        else if((systolicbp>=121&&systolicbp<=129)&&(diastolicbp>=60&&diastolicbp<=80)){
            System.out.println("your blood pressure is elevated");
        }
        else if((systolicbp>=130&&systolicbp<=139)&&(diastolicbp>=80&&diastolicbp<=89)){
            System.out.println("your blood pressure is high");
        }
        else if(systolicbp>=140||diastolicbp>=90){
            System.out.println("stage 2 high blood pressure");
        }
        else{
            System.out.println("invalid blood presssure reading");
        }


        





    }
}