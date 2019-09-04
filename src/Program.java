import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //bad variant
        
        System.out.println("Hello solid");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int sum=a+b;
        System.out.print("Result: ");
        System.out.print(sum);

    }
}
