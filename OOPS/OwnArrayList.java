package OOPS;
class ArrayList{
    int size;
    int[] arr;
    int idx =0;
    ArrayList(int capacity){
        arr=new int[capacity];
    }

    void add(int ele){
        if(idx==arr.length){
            capacityIncrease();
        }
        arr[idx++]=ele;
        size++;
    }
    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        arr = arr2;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void set(int index, int val){
        arr[index] = val;
    }
    void removefromEnd(){
        idx--;
        size--;
    }
    void remove(int index){
        // Complete it..
    }
    void insert(int index , int val){
        // Complete it...
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
    ArrayList  arr = new ArrayList(3);
    arr.add(1);  arr.add(2);  arr.add(3);
    arr.display();
        System.out.print(arr.get(1));
        arr.add(4); arr.add(5);
        arr.display();
    }
}
