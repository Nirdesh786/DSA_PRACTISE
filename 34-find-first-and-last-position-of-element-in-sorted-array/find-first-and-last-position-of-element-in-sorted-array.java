class Solution {
    public int[] searchRange(int[] nums, int target) {
     int low = 0;
     int high = nums.length-1;
     int floor = -1;
     int ceil = -1;
   

     while(low <=high){
        int mid = low + (high - low)/2;
        if(nums[mid]==target){    
            floor = mid;
            high  = mid -1;
        }else if(target>nums[mid]){   
            low = mid+1;
        }else{ 
            high = mid-1;
        }
     }   
     low = 0;
     high = nums.length-1;
        while(low <=high){
        int mid = low + (high - low)/2;
        if(nums[mid]==target){    
            ceil = mid;
            low  = mid +1;
        }else if(target>nums[mid]){   
            low = mid+1;
        }else{ 
            high = mid-1;
        }
     }  
     return new int[]{floor,ceil};
    }
}