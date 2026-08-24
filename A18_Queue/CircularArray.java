package A18_Queue;
class CircularQueue {
    private int[] arr;
    private int f;
    private int r;
    private int size;

    CircularQueue(int capacity) {
        arr = new int[capacity];
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val; // main
        if (r == arr.length) r = 0;
        size++;
    }

    int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        int frontval = arr[f];
        f++;  // main
        if (f == arr.length) f = 0;
        size--;
        return frontval;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        return arr[f]; // main
    }

    void display() {
        if (size == 0) return;
        if (f >= r) {
            for (int i = f; i < arr.length; i++) {// front to end
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < r; i++) { //start to rear-1
                System.out.print(arr[i] + " ");
            }
        }
        else if(f < r){
            for (int i = f; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
public class CircularArray {
    static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);
        q.add(10);q.add(20);q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40);q.add(50);
        q.display();
//        int[] a = q.arr;
//        for(int ele : a) System.out.print(ele +" ");
    }
}
