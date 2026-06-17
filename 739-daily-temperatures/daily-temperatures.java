class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        Stack<Integer> s=new Stack<>();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temp[i]>temp[s.peek()]){
                int index=s.pop();
                arr[index]=i-index;

            }
            s.push(i);
        }
        return arr;
        
    }
}