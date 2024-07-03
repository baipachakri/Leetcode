class Solution {
    public int numberOfMatches(int n) {
        int sum =0;
        while(n!=1){
            if(n%2==0){
                int temp = n/2;
                sum +=temp;
                n =n/2;
            }
            else if(n%2 == 1){
                    int temp = (n-1)/2;
                    sum = sum + temp;
                    n =((n-1)/2)+1;
            }

        }
        return sum;
    }
}