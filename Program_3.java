import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int limit = a;
        if (limit % 2 == 0) {
            limit--; 
        }

        for (int odd = 1; odd < limit * 2; odd += 2) {
            System.out.print(odd + " ");
        }

    }
}
