import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class soal1 {
    public static void main(String[] args) {
        
        int i, counter;
        SortedSet<Integer>sets = new TreeSet<Integer>();
    
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        
        int n = sc.nextInt();
                
        for(int j=2;j<=100;j++){

        counter = 0;

        for(i=1;i<=j;i++){

            if(j%i==0){
            counter++;        
            }
        }

            if(counter==2){
                sets.add(j);
            }
            
            
        }

        int Indexawal = 1;
    
        int Indexken = n;
        
        for (Integer element :sets) { 

            if (Indexawal == Indexken)
            {
                System.out.println("\n" + element);
                break;
            }
            Indexawal++;
        }
    }
  
    
    
}   


