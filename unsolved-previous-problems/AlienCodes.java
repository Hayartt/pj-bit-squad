import java.util.Scanner;

/**
 * Created by Haya on 16/03/2018.
 */
public class AlienCodes {
    public static void main(String[] args) {
        System.out.println(total((new Scanner(System.in)).nextInt()));
    }
    static int total(int n){
        switch (n) {
            case 1: return 2;
            case 2: return 3;
            case 3: return 4;
        }
        return total(n - 2) + total(n - 3);
    }
}
