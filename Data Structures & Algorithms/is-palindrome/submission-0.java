class Solution {
    public boolean isPalindrome(String s) {
       String res="";
       String str=s.toLowerCase();
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            res+=ch;
        }
       }
       int left=0;
       int right =res.length()-1;
       while(left<right){
        if(res.charAt(left)!=res.charAt(right)){
            return false;
        }
        left++;
        right--;

       }
       return true;

    }
}
