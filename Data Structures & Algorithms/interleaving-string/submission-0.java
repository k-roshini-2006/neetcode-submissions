class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() !=s1.length()+s2.length()){
            return false;
        }
        HashMap<String,Boolean> dp=new HashMap<>();
        return canInterleave(s1,s2,s3,0,0,dp);
    }
    private boolean canInterleave(String s1,String s2,String s3,int i,int j,HashMap<String,Boolean> dp){
        if(i==s1.length() && j==s2.length()){
            return true;
        }
        String cache=i + "," + j;
        boolean result=false;
        int k=i+j;
        if(dp.containsKey(cache)){
            return dp.get(cache);
        }
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            result=canInterleave(s1,s2,s3,i+1,j,dp);
        }
        if(!result && j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            result=canInterleave(s1,s2,s3,i,j+1,dp);
        }
        dp.put(cache,result);
        return result;
    }
}
