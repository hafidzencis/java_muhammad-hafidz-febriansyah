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
            int maxNumber = 10;
        
            for(int i = 0; i < maxNumber; i++){
                System.out.print(fibonacci(i) +" ");
            }
        }

}
