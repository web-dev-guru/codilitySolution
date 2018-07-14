package prefixsum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest {

    @Test
    public void solution() {
        CountDiv cd = new CountDiv();
        int a=6;
        int b=11;
        int k=2;
        Assert.assertEquals(3,cd.solution(a,b,k));
    }
}