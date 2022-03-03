import java.util.Arrays;

public class soal5 {
    public static void main(String[] args) {
        String[] arr = {"js", "js", "golang", "ruby", "ruby", "js", "js"};
        System.out.println("Input " + Arrays.toString(arr));
        System.out.println();
        // Arrays.sort(arr);

        int go = 0;
        int js = 0;
        int ru = 0;

        for (int i = 0; i < arr.length; i++) {
            if ("golang" == arr[i]) {
                go++;
            }
            else if ("js" == arr[i]) {
                js++;
            }
            
            else{
                ru++;
            }
        }
        System.out.println("golang-> "+ go+" ruby-> "+ru+ " js-> "+js);

    }
}
