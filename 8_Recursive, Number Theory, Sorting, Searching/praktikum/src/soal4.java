import java.util.Arrays;

public class soal4 {
    public static void main(String[] args) {
    //    int[] arr = {25000, 25000, 10000, 14000};
    //     int money = 50000;

        int[] arr = {15000, 10000, 12000, 5000, 3000};
        int money = 30000;

        System.out.println("Money = " +money+"\nProductPrice = "+  Arrays.toString(arr)+ "\n");

       

        

        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (money >= arr[i]){
                money = money - arr[i];
                count++;
            }
        }

        System.out.println(count);

    }
}
