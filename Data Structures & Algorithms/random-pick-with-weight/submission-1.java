class Solution {
    int wei[];
    int sum=0;
    double pre[];
    public Solution(int[] w) {
        wei=new int[w.length];
        pre=new double[w.length];
        for(int i=0;i<w.length;i++){
            wei[i]=w[i];
            sum+=w[i];
        }
        for(int i=0;i<w.length;i++){
            pre[i]=(double)wei[i]/sum;
        }
        
    }

    public int pickIndex() {
        double r=Math.random();
       double c=0;
       for(int i=0;i< pre.length;i++)
        {
            c+=pre[i];
            if(r<c){
                return i;
            }
        }
        return pre.length-1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */