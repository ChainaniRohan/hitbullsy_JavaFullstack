package Day02;

public class Patterns {
    public static void left(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n;i++){
//            for (int j = 1; j <= (i/2)+1; j++){
//                System.out.print(j);
//            }
//            for (int j = 1; j <= i/2; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        int arr[] = {1,2,3,4,5};
//        left(arr);
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + ", ");
//        }
    }
}
