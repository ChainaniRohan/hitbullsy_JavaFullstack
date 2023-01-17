package Day01;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class numPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //first Pattern
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        //second pattern
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        //third pattern
//        for (int i = n; i >= 1; i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        fourth pattern
        for (int i = 0; i <= n; i++){
                System.out.println((int)Math.pow(11,i));
        }
    }
}
