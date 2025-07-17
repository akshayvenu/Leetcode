class Solution {
    public String defangIPaddr(String address) {
       
        
        String newValue  = address.replace(".","[.]");
        return newValue ; 
    }
}