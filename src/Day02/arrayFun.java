package Day02;

public class arrayFun {
    public static int max(int arr[]){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > m){
                m = arr[i];
            }
        }
        return m;
    }
    public static int min(int arr[]){
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < m){
                m = arr[i];
            }
        }
        return m;
    }
    public static int sum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(sum(arr));
    }
}
