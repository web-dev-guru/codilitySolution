package countelement;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A){
        int result=1;
        Arrays.sort(A);
        if(A.length==0){
            return 0;
        }else if(A.length==1){
            return result;
        }else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] != (A[i] + 1)) {
                    result = 0;
                    break;
                }
            }
        }
        return result;
    }
}
1