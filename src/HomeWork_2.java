import java.util.Arrays;

public class HomeWork_2 {
    public static void main(String[] args) {
//      Задание#1
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

//      Задание#2
        int counter = 0;
        int[] a = new int[8];
        for (int i = 1; i < a.length; i++) {
            a[i] = counter += 3;
        }
        System.out.println(Arrays.toString(a));

//      Задание#3
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < b.length; i++) {
            if (b[i] <= 6) {
                b[i] *= 2;
            } else {
                continue;
            }
        }
        System.out.println(Arrays.toString(b));

//      Задание#4
        int[][] c = new int[4][4];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i - j == 0) {
                    c[i][j] += 1;
                    System.out.print(c[i][j] + " ");
                } else {
                    c[i][j] = 0;
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.print("\n");
        }

//      Задание#5
        int[] d = {1, 9, 6, 2, 11, 5, 10, 5, 7};
        int max = d[0];
        int min = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] > max) {
                max = d[i];
            } else if (d[i] < min) {
                min = d[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

//      Задание#6
        int[] m = {2, 4, 7, 9, 7, 4, 9, 2};
        System.out.println(checkBalance(m));

//      Задание#7
        int[] l = {1, 2, 3, 4, 5, 6, 7, 8};
        arrayMove(l,3);
    }

    //      Задание#6
    public static boolean checkBalance(int[] arr) {
        int amount = 0;
        for (int j = 0; j < arr.length; j++){
            amount += arr[j];
        }
        if (amount % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    //      Задание#7
    public static void arrayMove(int[] ar, int n){
        int t = ar[0];
        for (int i = 0; i < ar.length - n; i++){
            ar[i] = ar[i + n];
        }
        for (int i = ar.length - n; i < ar.length; i++) {
            ar[i] = t;
            t++;
        }
        System.out.println(Arrays.toString(ar));
    }
}
