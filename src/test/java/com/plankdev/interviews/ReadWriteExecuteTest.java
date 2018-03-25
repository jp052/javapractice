package com.plankdev.interviews;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class ReadWriteExecuteTest {

    @Test
    public void shouldWrite752() {
        //assemble
        int OCTAL_EXPECTED = 752;

        //action
        int octal = ReadWriteExecute.symbolicToOctal("rwxr-x-w-");

        //assert
        Assert.assertThat(octal, CoreMatchers.equalTo(OCTAL_EXPECTED));
    }
}
