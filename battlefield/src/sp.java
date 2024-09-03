public class sp {
    public static void main(String[] args) {
        rev();
        System.out.println();
        ascii();
        System.out.println();
        ascii2();
        System.out.println();
    }

    static void rev() {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
        static void ascii() {
            for (int i = 97; i < 123; i++) {
                System.out.print((char) i + " ");
            }
        }
            static void ascii2() {
                for (int i = 67; i < 91; i++) {
                    System.out.print((char) i + " ");
                }
            }
        }

