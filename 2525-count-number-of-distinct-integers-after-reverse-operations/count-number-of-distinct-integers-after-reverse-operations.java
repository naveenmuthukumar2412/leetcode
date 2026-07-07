class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int a :nums){
            int rev=0;
            set.add(a);
            while(a>0){
                int digit=a%10;
                 rev=rev*10+digit;
                a/=10;
            }
            set.add(rev);
        }
        return set.size();
        
    }
}