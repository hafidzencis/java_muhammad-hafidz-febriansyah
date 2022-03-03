public class soal2 {
        public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
                return 1;
            }
        return fibonacci(n-2) + fibonacci(n-1);
        }
        public static void main(String args[]) {
            
            int angka = 10;
            System.out.println(angka + "\n");
        
            for(int i = 0; i < angka; i++){
                System.out.print(fibonacci(i) +" ");
            }
        }

}
