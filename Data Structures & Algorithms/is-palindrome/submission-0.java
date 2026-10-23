class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-z0-9A-Z]","").toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}
