package com.plankdev.interviews;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TestDomeTest {

    @Test
    public void initTestDomeTest() {
        TestDome testDome = new TestDome();
        String testString = testDome.hello();

        Assert.assertThat(testString, CoreMatchers.equalTo("hello"));
    }
}
