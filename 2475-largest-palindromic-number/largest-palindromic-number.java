class Solution {
    public String largestPalindromic(String num) {
        int feq[] = new int[10];
        for(char x : num.toCharArray()) feq[x-'0']++;
        int maxodd = -1;
        StringBuilder sb = new StringBuilder();
        for(int i = 9;i>=0;i--){
            if(feq[i]==0) continue;
            if(i==0 && sb.length()==0) {
                if(maxodd==-1) maxodd = 0;
               
                continue;
            }
            int x = feq[i],itr=0;
            if(x%2==0) itr = x/2;
            else {
                if(maxodd==-1) maxodd = i;
                x--;
                itr = x/2;
            }
            while(itr>0){
                sb.append(i);
                itr--;
            }
        }
        StringBuilder rev  = new StringBuilder(sb);
         if(maxodd!=-1) sb.append(maxodd);
        sb.append(rev.reverse());
        return sb.toString();
    }
}