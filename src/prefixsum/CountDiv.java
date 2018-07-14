package prefixsum;

public class CountDiv {
/***
 *
 * Write a function:
 *
 * int solution(int A, int B, int K);
 *
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 *
 * Assume that:
 *
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 * Complexity:
 *
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 * */
    public int solution(int a,int b,int k){
        int counter=0;
        if(k==0){
            return 0;
        }
        if(k==1){
            return b-a;
        }
        if(a==b){
            return 0;
        }
        for (int i=a;i<=b;i++){
            if(i%k==0){
                counter++;
            }
        }
        return counter;
    }
}
