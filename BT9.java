package ThucHanhJava.Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        //Xuat cac phan tu trong mang
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //Tim phan tu lon nhat
        Math.max(arr1[0], arr1[n - 1]);

        //Tim phan tu nho nhat
        Math.min(arr1[0], arr1[n - 1]);

        //Nhap vao so x va kiem tra xem so x co nam trong mang khong
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(arr1, x) >= 0) {
                System.out.println("So " + x + " nam trong mang");
                break;
            }
            if (i == n - 1) {
                System.out.println("So " + x + " khong nam trong mang");
            }
        }

    }
}
