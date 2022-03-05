/**
 * soal1
 */

import java.util.*;
public class soal1 {
    public static void main(String[] args) {
        int a= 0; 
        int b = 0; 
        int c = 0;

        boolean temu = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String in = sc.nextLine();
        
        String[] arrstr = in.split(" ");
        
        int idxawal = 1;
        for (Object item : arrstr) {
            if (item instanceof String) {
                String itemstr = (String) item;
                int itemint = Integer.parseInt(itemstr);
                if (idxawal == 1) {
                    a = itemint;
                    idxawal++;
                } else if (idxawal == 2) {
                    b = itemint;
                    idxawal++;
                } else {
                    c = itemint;
                }

            }
        }
        for (int x = 0; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                if (  x != y && ( (x * x + y * y) + (a - x - y) * (a - x - y) == c ) ) {
                    int ztemp = x * y;
                    int z = b/ztemp;
                        if (z != x && z != y && x + y + z == a ) {
                            if (!temu) {
                                System.out.println("\n"+x + " " + y + " " +z);
                                temu = true;
                                break;
                            }
                           
                           
                        }
                    }
                   
                }
              
            }
            if (!temu) {
                System.out.println("\nNo Solution");
            }
        }
        
    }
    
