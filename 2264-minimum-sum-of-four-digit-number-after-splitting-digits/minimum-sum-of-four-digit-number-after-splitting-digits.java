class Solution {
    public int minimumSum(int num) {
        int[] split =  new int[4];
        int i=0;
        while(num !=0){
            split[i] = num %10;
            i++;
            num = num/10;
        }
        Arrays.sort(split);
        return ((split[0]*10+split[3])+(split[1]*10+split[2])) ;
    }
}