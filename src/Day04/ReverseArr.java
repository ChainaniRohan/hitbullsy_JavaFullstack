package Day04;

public class ReverseArr {
    public static void reverse(int arr[]){
        int f = 0;
        int l = arr.length-1;
        while (f < l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        reverse(arr);
    }
}
