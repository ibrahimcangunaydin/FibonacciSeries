import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, a = 0, b = 1, c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
