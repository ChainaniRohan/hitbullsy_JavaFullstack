package Day11;

public class sumOfDistinceNum {
    public static int sum(int a, int b, int c){
        if (a==b){
            if (b == c){
                return 0;
            }
            else return c;
        }
        else {
            if (b == c){
                return a;
            }
            else return a+b+c;
        }
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 4;
        System.out.println(sum(a,b,c));
    }
}
