class Solution {
    public void sortColors(int[] nums) {
        
        // there are just 3 colors still it sucks in array recalibaraion man
        // fak just read the solution and whatta question man 

        // idk what kind of tool is that but wow 

        // appraoch -> its 3 unique shit -> record in first pass the count of 3  -> then override the array

        int n0 = 0;
        int n1= 0;
        int n2 =0;
        for(int n: nums){
            if(n == 0) n0++;
            else if(n == 1) n1++;
            else if(n==2)n2++;
        }

        int idx =0;
        while(idx<nums.length){
            if(n0>0){
                nums[idx] = 0;
                n0--;
            }
            else if(n1>0){
                nums[idx] = 1;
                n1--;
            }
            else{
                 nums[idx] = 2;
            } 
            idx++;
        }
    }
}