package Day02;

public class leftRotation {
    public static void left(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        left(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
