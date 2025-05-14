package DAY8;

import java.util.Scanner;

public class insertAtPosition {
    public static void insertAtPos(int arr[], int pos, int num) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = num;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void insert_at_pos(int arr[], int k, int pos) {
        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = k;
        System.out.print("Array after insertion is :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // for (int i = 0; i < n - 1; i++) {
        // arr[i] = sc.nextInt();
        // }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element: ");
        int num = sc.nextInt();
        insertAtPos(arr, pos, num);
        // insert_at_pos(arr, num, pos);
    }
}
