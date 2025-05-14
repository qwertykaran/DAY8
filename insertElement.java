package DAY8;

import java.util.Scanner;

public class insertElement {
    public static void insertAtStart(int arr[], int num) {
        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = num;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        insertAtStart(arr, 4);
    }
}