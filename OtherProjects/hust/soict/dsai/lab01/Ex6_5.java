import java.util.Scanner;

public class Ex6_5 {

    private static void Sort(int[] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(A[i] < A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double avg;
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        avg = sum / n;
        Sort(arr);

        for(int j = 0; j < n; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(avg);

        scanner.close();
    }
}
