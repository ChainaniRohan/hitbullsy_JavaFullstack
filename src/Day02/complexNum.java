package Day02;

public class complexNum {
    public static void add(int real1,int img1, int real2, int img2){
        int real = real1+real2;
        int img = img1+img2;
        System.out.println(real+" + "+img+"i");
    }
    public static void sub(int real1,int img1, int real2, int img2){
        int real = real1-real2;
        int img = img1-img2;
        System.out.println(real+" + "+img+"i");
    }
    public static void mul(int real1,int img1, int real2, int img2){
        int real = real1*real2;
        int img = img1*img2;
        System.out.println(real+" + "+img+"i^2");
    }
    public static void main(String[] args) {
        int real1 = 5;
        int real2 = 13;
        int img1 = 7;
        int img2 = 6;
//        add(real1,img1,real2,img2);
//        sub(real1,img1,real2,img2);
        mul(real1,img1,real2,img2);
    }
}
