import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
      


        System.out.println(fibonacci(inp));
    }

    static int fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int x = 0;
        int y = 1;

        for (int i = 1; i < n +1 ; i++) {
            int Temp = x + y;
            x = y;
            y = Temp;
        }
        return x;
    }
}
