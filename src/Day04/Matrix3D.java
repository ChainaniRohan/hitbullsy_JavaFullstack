package Day04;

public class Matrix3D {
    public static void add(int arr[][], int mat[][]){
        int sum[][] = new int[arr.length][mat.length];
        int mux[][] = new int[arr.length][mat.length];
        for (int i =0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                sum[i][j] = arr[i][j] + mat[i][j];
                mux[i][j] = arr[i][j] * mat[j][i];
            }
        }
//        for (int i = 0; i < sum.length; i++){
//            for (int j = 0;  j < sum.length; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < sum.length; i++){
            for (int j = 0;  j < sum.length; j++){
                System.out.print(mux[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < sum.length; i++){
            for (int j = 0;  j < sum.length; j++){
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat[][] = {{2,4,6},{1,3,5},{2,3,5}};
        add(arr, mat);
    }
}
