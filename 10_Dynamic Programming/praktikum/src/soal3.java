import java.util.HashSet;
import java.util.Set;

public class soal3 {
    public static void main(String[] args) {
        
        // int[] arr = {30, 10, 60, 10, 60, 50};

        int[] arr = {10, 30, 40, 20};
        int total = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int tbh = Math.abs(arr[i] - arr[i+1]);
            total += tbh;
        }

        System.out.println(total / arr.length);
    }   
}
