package com.goelrishabh.simplelogin;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EditTextUtilTest {

    @Test
    public void basicUiValidation() {
//        assertTrue(EditTextUtil.basicUiValidation("", ""));
        assertFalse(EditTextUtil.basicUiValidation("", ""));
    }

}
