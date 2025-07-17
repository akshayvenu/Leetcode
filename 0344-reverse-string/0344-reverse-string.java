class Solution {
    public void reverseString(char[] s) {
        int i = 0 ; 
        int last = s.length-1;
        char temp ;
// wrsp

        while(i<last){
            temp = s[i];
            s[i] = s[last];
            s[last] = temp ; 
            i++ ;
            last--;
        }
    }
}