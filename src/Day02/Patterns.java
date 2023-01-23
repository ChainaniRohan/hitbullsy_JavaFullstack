package Day02;

public class Patterns {

    public static void main(String[] args) {
        int n = 5;
//        for (int i = 1; i <= n;i++){
//            for (int j = 1; j <= (i/2)+1; j++){
//                System.out.print(j);
//            }
//            for (int j = n/2; j >= 1; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++){
//            int a = 1;
//            while (a <= i){
//                System.out.print(i);
//                a++;
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=n; i++){
            int pl = i*(((int)Math.pow(10,i)-1)/9);
            System.out.println(pl);
        }


    }
}
