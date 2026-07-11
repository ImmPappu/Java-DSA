package A12_Recursion;

public class BinarySearchUsingRecusion {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(search(nums,2));
    }

        public static int helper(int[] nums, int target ,int lo,int high){
            if(lo>high) return -1;
            int mid = lo +(high-lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) return helper(nums,target,lo,mid-1);
            else return helper(nums,target,mid+1,high);
        }

        public static int search(int[] nums, int target) {
            int n = nums.length;
            return helper(nums,target,0,n-1);

        }
    }

