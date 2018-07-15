import java.util.*;

public class exam {

    public boolean solution(int[] A){
        Boolean result = true;
        HashSet<Integer> items= new HashSet<Integer>();
        for(int i = 0; i < A.length; i++){
            items.add(A[i]);
        }
        if(items.size()>1) {
            //check all item same
            if (A.length > 2) {
                int count = 0;
                int[] copyOfA = Arrays.copyOf(A, A.length);
                //Sort A
                Arrays.sort(A);
                for (int i = 0; i < A.length; i++) {
                    if (A[i] != copyOfA[i]) {
                        count++;
                    }
                    if (count > 2) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public int squares(int A, int B){
        int count=0;
        if(A<B) {
            if(B>0) {
                if (A < 0) {
                    for (float i = 0; i <= B; i++) {
                        for (float j = 0; j * j <= i; j++) {
                            if (j * j == i) {
                                count++;
                            }
                        }
                    }
                }
                if (A >= 0) {
                    for (float i = A; i <= B; i++) {
                        for (float j = 0; j * j <= i; j++) {
                            if (j * j == i) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
    public int depthFirst(TreeNode t){
        int count=0;
        while(t!=null) {
            count++;
            depthFirst(t.leftNode);
        }
        return count;
    }
}

1