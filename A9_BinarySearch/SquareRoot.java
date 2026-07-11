package A9_BinarySearch;

public class SquareRoot {
        public static int mySqrt(int x) {
            if (x == 0)
                return 0;
            int low = 1;
            int high = x;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long square = (long) mid * mid;
                if (square == x)
                    return mid;
                else if (square < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return high;
        }

        public static void main(String[] args) {
//        int low = 1;
//        int high =20;
//        int n = 20;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(mid*mid==n){
//                System.out.println(n);
//            }
//            else if(mid*mid<n){
//                low = mid+1;
//            }
//            else high = mid-1;
//            }
//        System.out.println(high);
//        }
           int result = mySqrt(30);
            System.out.println(result);

        }
    }
