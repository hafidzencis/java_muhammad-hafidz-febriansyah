import java.util.Arrays;

public class soal4 {
    public static void main(String[] args) {
        //int[] arrlist = {1, 1, 3, 5, 5, 6, 7};

        int[] arrlist = {12, 15, 15, 19, 24, 31, 53, 59, 60};
        Arrays.sort(arrlist);
        System.out.println(Arrays.toString(arrlist));

        //System.out.println(binSe(arrlist, 3));

        System.out.println(binSe(arrlist, 100));
    }
    static int binSe(int[] arr, int cari){
        int kiri = 0;
        int kanan = arr.length-1;
        while ( kiri<= kanan) {
            int tengah = (kiri+kanan) / 2;
            if (arr[tengah] == cari) {
                return tengah;
            }else if (cari < arr[tengah]) {
                kanan = tengah - 1;
            }else{
                kiri = tengah +1;
            }
        }
        return -1;
    }
}
