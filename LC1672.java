class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] account1:accounts){
            int sum = 0;
            for(int account2:account1){
                sum+=account2;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}

