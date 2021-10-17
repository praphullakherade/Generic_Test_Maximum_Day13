package com.generictest;

import org.junit.Assert;
import org.junit.Test;

public class TestPosition {
    @Test
    public void integerMax_AtFirstPosition() {
        int actualResult = TestMaximum.findMaximum(56,15,30);
        Assert.assertEquals(56,actualResult);
    }
}
