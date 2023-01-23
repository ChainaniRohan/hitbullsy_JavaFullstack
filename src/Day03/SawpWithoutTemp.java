package Day03;

public class SawpWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int sum = a+b;
        a = sum-a;
        b = sum-a;
        System.out.println(a);
        System.out.println(b);
    }
}
