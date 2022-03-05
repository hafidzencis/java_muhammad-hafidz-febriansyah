import java.util.Arrays;

public class soal3 {

    
    public static void main(String[] args) {
        // int[] dragonhead = {5,4};
        // int[] knightHeigt = {7,8,4};

        // int[] dragonhead = {5,10};
        // int[] knightHeigt = {5};

        // int[] dragonhead = {7,2};
        // int[] knightHeigt = {4,3,1,2};

        int[] dragonhead = {7,2};
        int[] knightHeigt = {2,1,8,5};

        Arrays.sort(dragonhead);
        Arrays.sort(knightHeigt);

        int ttlhead = 0;
        int ttlheightknight = 0;

        
        for (int i : dragonhead) {
            ttlhead += i;
            for (int j = 0; j < knightHeigt.length; j++) {
                if (knightHeigt[j] >= i) {
                    ttlheightknight += knightHeigt[j];
                    break;
                }
            }
        }

        if (ttlheightknight >= ttlhead) {
            System.out.println(ttlheightknight);
        } else{
            System.out.println("knight fall");
        }
    }
}   
