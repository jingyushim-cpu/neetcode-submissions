class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1) return true;

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char a = s.charAt(left);
            char b = s.charAt(right);

            if(!Character.isLetterOrDigit(a)) left++;
            else if(!Character.isLetterOrDigit(b)) right--;
            else{
                if(a != b) return false;
                left++;
                right--;
            }
        }

        return true;
    }
}
