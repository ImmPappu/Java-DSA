package A9_BinarySearch;

public class SingleAmongDoubles {
    static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        if(arr[0]!=arr[1]){
            System.out.println(arr[0]);
            return;
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) {
                System.out.println(arr[mid]);
                return;
            }
            int f = mid; int s = mid;
            if(arr[mid-1]==arr[mid]) f = mid-1;
            else s = mid+1;

            int leftcount = f-low;
            int rightcount = high-s;
            if(leftcount%2==0) low = s+1;
            else high = f-1;
        }

        }
    }

