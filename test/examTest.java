import org.junit.Test;

import static org.junit.Assert.*;

public class examTest {

    @Test
    public void solution() {
        exam e =new exam();
        int[] a = {1,3,5,3,4};
        System.out.println(e.solution(a));
    }

    @Test
    public void squares() {
        exam e =new exam();
        System.out.println(e.squares(4,17));
    }
}