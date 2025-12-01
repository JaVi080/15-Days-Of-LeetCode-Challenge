class Solution {
    public int thirdMax(int[] nums) {
         Arrays.sort(nums);
        int n=nums.length;
        //finding 3rd max element 
        int i=n-1; int count=0;

        System.out.println(i);
        int thrd_max=nums[n-1];
       while(count!=2&&i>=0){
        if(nums[i]<thrd_max)
            {thrd_max=nums[i];
                  count++;
            };
        i--;
       }
       if(count==2)return thrd_max;
        return nums[n-1];
    }
}