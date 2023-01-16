package Day01;

import java.util.Scanner;

public class ExceptionHandlingXbyY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
        try {
            System.out.println(x/y);
        }
        catch (ArithmeticException e1){
            System.out.println(y+" is Invalid number!");
        }
        catch(java.util.InputMismatchException e2){
            System.out.println(x+" and "+y+" are not 32 bit signed Integer!");
        }

        catch(Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
