class Solution {
    public int subtractProductAndSum(int n) {
        int summ =0,proo =1,result;
        while(n!=0){
            summ +=n%10;
            proo *=n%10;
            n=n/10;
        }
        result = proo- summ;
        return result;
    }

}