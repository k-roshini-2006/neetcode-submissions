class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int[] ans=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            ans[i]=Integer.parseInt(details[i].substring(11,13));
            if(ans[i]>60){
                count++;
            }
        }
        return count;
    }
}