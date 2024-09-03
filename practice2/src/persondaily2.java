import java.util.Scanner;

class persondaily2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int steps = s.nextInt();
        try {


            System.out.println(getactivity(s.nextInt()));
        }
        catch(Exception e){
            System.out.println("invalid input");
            s.next();

        }

    }



        public static String getactivity(int steps) {
            if (steps < 5000) {
                return "sedentary";

            } else if (steps <= 5000 && steps <= 7499) {
                return "low active";

            } else if (steps <= 7500 && steps <= 9999) {
                return "some what active";

            } else if (steps <= 10000 && steps <= 12499) {
                return "active";

            }
            return null;

        }
}