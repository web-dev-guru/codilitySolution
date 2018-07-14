import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class CodeExampleTest {

    @Test
    public void dominatorSolution() {
        CodeExample ce = new CodeExample();
        int[] input = new int[]{3,3,23,22,3};
        int result = ce.DominatorSolution(input);
        System.out.println(result);
        int[] input1 = new int[10];
        HashSet<Integer> intset= new HashSet<Integer>();
        System.out.println(intset.add(1));
        System.out.println(intset.add(1));
        double c = Math.floor(5.3);
        double d = Math.ceil(5.3);
        System.out.println("c:"+c+" d:"+d);
    }
}