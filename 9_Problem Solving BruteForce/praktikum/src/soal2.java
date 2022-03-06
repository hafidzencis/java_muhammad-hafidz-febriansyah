import java.util.*;
public class soal2 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int uang = sc.nextInt();
            

        int[] pecahan = {1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        int n = pecahan.length;

   
        ArrayList<Integer> hasil = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            while (uang >= pecahan[i]) {
                uang -= pecahan[i];
                hasil.add(pecahan[i]);
            }
        }

        System.out.println((hasil));
    }
}
