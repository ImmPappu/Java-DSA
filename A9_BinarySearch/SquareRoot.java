package A9_BinarySearch;

public class SquareRoot {
    static void main(String[] args) {
        int low = 1;
        int high =20;
        int n = 20;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid==n){
                System.out.println(n);
            }
            else if(mid*mid<n){
                low = mid+1;
            }
            else high = mid-1;
            }
        System.out.println(high);
        }
}
