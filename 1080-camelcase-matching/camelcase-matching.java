class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
    for (String query : queries) {
     int j = 0;
     boolean match = true;
    for (int i = 0; i < query.length(); i++) {
     char ch = query.charAt(i);
      if (j < pattern.length() && ch == pattern.charAt(j)) {
        j++;
     } 
    else if (Character.isUpperCase(ch)) {
     match = false;
                                                                                                 break;                                                                                                     }
}
ans.add(match && j == pattern.length());
                                                                                                     }

return ans;            
      }                                                                      
        
    }
