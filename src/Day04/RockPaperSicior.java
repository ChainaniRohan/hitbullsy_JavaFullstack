//package Day04;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class RockPaperSicior {
//    Scanner sc = new Scanner(System.in);
//    public static void game(){
//
//    }
//    public static void main(String[] args) {
//        Random rand = new Random();
//        System.out.println("Welcome To Rock paper Sisor!");
//        System.out.println("1. One game round");
//        System.out.println("2. Three game round");
//        System.out.println("3. Five game round");
//        System.out.print("Enter round of Game ");
//        int rou = sc.nextInt();
//        while (rou >= 1 && rou <= 3){
//            System.out.println("Rock : 1  | Paper : 2 | Sicior : 3");
//            int game = sc.nextInt();
//            while (game < 1 || game > 3){
//                System.out.println("Invalid Enter Again");
//                System.out.println("Rock : 1  | Paper : 2 | Sicior : 3");
//                System.out.print("Game : ");
//                game = sc.nextInt();
//            }
//        }
//        int cpu = rand.nextInt(3);
//        System.out.println("rand: "+cpu);
//    }
//}
