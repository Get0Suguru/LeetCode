class Solution {
    public String longestCommonPrefix(String[] strs) {
        /** 
        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters if it is non-empty. 
        */

        int n = strs[0].length();
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];

        int baseIdx = 0;

        outer: while(baseIdx < n){

            char c = strs[0].charAt(baseIdx);
            for(String s: strs){
                if(baseIdx < s.length() && s.charAt(baseIdx) == c) continue;
                else break outer;
            }
            baseIdx++;
        }

        return baseIdx == 0 ? "" : strs[0].substring(0,baseIdx);  // i think its (inc, exclusive)
    }
}