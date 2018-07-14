public class CodeExample {
    public CodeExample() {
    }

    public  int DominatorSolution(int[] A) {
        if(A.length == 0) return -1;
        int count     = 0;
        int elem      = A[0];
        for(int i : A){
            if(i == elem){
                count++;
            } else {
                if(count == 0){
                    count++;
                    elem = i;
                }
                else count--;
            }
        }
        int ct = 0;
        int ind = -1;
        for(int i = 0; i < A.length; i++){
            if(A[i] == elem){
                ct++;
                ind = i;
            }
        }
        if(ct > A.length/2) return ind;
        else return -1;
    }


}
