import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Prompt user for input
        System.out.print(&quot;Enter the number of lines (N): &quot;);
        int N = scanner.nextInt();

// Loop to print the pattern
        for (int i = 1; i &lt;= N; i++) {
// Print spaces
            for (int j = 1; j &lt;= (N - i); j++) {
                System.out.print(&quot; &quot;);
            }
// Print hashes
            for (int k = 1; k &lt;= i; k++) {
                System.out.print(&quot;#&quot;);
            }
// Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}