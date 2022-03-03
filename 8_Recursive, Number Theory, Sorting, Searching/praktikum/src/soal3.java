import java.util.Arrays;

public class soal3 {
    public static void main(String[] args) {

        int arr[] = {5, 7, 4, -2, -1, 8}; 
      

        //int arr[] = {2, -5, -4, 22, 7, 7};
        
        System.out.println(Arrays.toString(arr) + "\n");
        int besar = arr[0];
        int kecil = arr[0];
        int indexkecil = 0;
        int indexbesar = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
         
            if ( kecil > arr[i]) {
                kecil = arr[i];
                indexkecil = i;
            }
            if ( besar < arr[i]) {
                besar = arr[i];
                indexbesar = i;
            }

         

       
    }
    System.out.println("min : "+ kecil + " index : " + indexkecil  +" max : " + besar + " index : " + indexbesar );
}
    
}
