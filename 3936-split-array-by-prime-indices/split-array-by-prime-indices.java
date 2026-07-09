class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        int []arr=new int [n+1];
        
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i*i<n;i++){
            if(arr[i]==0){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=1;
                }
            }
        }
        long a=0,b=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                b+=nums[i];
            }else{
                a+=nums[i];
            }
        }
        return Math.abs(a-b);
    }
}
    
