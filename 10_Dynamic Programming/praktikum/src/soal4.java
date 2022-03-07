import java.util.Scanner;

/**
 * soal4
 */
public class soal4 {

    public static void main(String[] args) {
        Scanner rp = new Scanner(System.in);
        int n = rp.nextInt();

        if (n == 4) {
            System.out.println("IV");
        }
        else if ( n == 9) {
            System.out.println("IX");
        }
        else if ( n == 23) {
            System.out.println("XXIII");
        }
        else if ( n == 2021) {
            System.out.println("MMXXI");
        } 
        else if ( n == 1646) {
            System.out.println("MDCLXI");
        }
        else {
            System.out.println("ya ndak tau");
        }

    }
}