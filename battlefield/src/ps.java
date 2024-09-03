
    public class ps {

        public static void main(String[] args) {

            System.out.println("hi");

            for (int i = 1; i <= 5; i++) {


                for (int j = 1; j <= 5; j++) {

                    if (i == 1 || j == 1 || i + j == 6) {

                        System.out.print("*");

                    } else {

                        System.out.print(" ");

                    }


                }

                System.out.println();


            }

            System.out.println();
        }
    }