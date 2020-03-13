import java.util.*;

public class Queue {
    String name;
    int t;
    int head, tail;

    static Queue dequeue(Queue x, int head){
        Queue a = x;
        head = head + 1;
        return x;
    }

    static void enqueue(Queue x, Queue y, int tail){
        y[tail] = x;
        tail++;
    }

    static int min(int a, int b) {return a < b ? a : b;}

    public static void main(String[] args) {
        int elaps=0, c;
        int i, q, n;
        Queue u;
        Queue[] Q = new Queue[100005];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();
        for (int j = 1; j <= n; j++) {
            Q[j].name = scanner.next();
            Q[j].t = scanner.nextInt();
        }
        Q[0].head = 1; Q[n-1].tail = n+1;

        while(Q[0].head != Q[n-1].tail){
            u = dequeue(Q[0].head, Q[n-1].tail);
            c = min(q, u.t);
            u.t -= c;
            elaps += c;
            if(u.t > 0) enqueue(u, u, tail);
        }

    }
}
