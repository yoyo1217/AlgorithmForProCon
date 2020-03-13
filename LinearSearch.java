import java.util.*;

public class LinearSearch {

    static boolean SentinelLinearSearch(int[] A, int n, int key){
        int i=0;
        // set sentinel
        A[n] = key;
        while(A[i] != key) i++;
        return i != n;
    }

    static boolean LinearSearch(int[] A, int n, int key){
        for (int i = 0; i < n; i++) {
            if(A[i] == key) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, q, key, sum=0;
        int[] A = new int[100001];

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            key = scanner.nextInt();
            if(LinearSearch(A, n, key)) sum++;
        }
        System.out.println(sum);
    }
}
