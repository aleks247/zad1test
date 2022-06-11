import java.util.Scanner;

public class Main {
    public static void printingDevisibleNumbers(int N) {
        int i = 1;
        while (i <= N) {
            System.out.println(i++);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printingDevisibleNumbers(n);
    }
}