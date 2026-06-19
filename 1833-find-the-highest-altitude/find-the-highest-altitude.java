class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
         int current=0;
         int maxalt=0;
        for(int i=0;i<n;i++){
            current+=gain[i];
        
        maxalt=Math.max(current,maxalt);
        }
         return maxalt;
        }
    }

