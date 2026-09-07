class Solution {
    public boolean validPalindrome(String s) {
        // seems doable tbh -> with 2 pointers

        /**
        1 <= s.length <= 105
        s consists of lowercase English letters.


         */
        if (s.length() <= 2) return  true; // can delete 1

        int p1=0;
        int p2=s.length() -1; //inclusive now

        boolean del = true;
        while(p2>p1){
            if(s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;
                
            } 
            else if(s.charAt(p1) != s.charAt(p2)){
                return isPalindrom(s, p1+1, p2) || isPalindrom(s, p1, p2-1);
            }
        }

        return true;
    }
    public boolean isPalindrom(String s, int i, int j){
        while(j>i){
            if(s.charAt(i) != s.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}