package com.goelrishabh.simplelogin;

import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public final class EditTextUtil {

    public static String getValue(EditText editText) {
        return getValue(editText, "");
    }

    public static String getValue(EditText editText, String defaultValue) {
        return editText == null ? defaultValue : editText.getText().toString();
    }

    public static boolean basicUiValidation(final String var1, final String var2) {
        return !"".equals(var1) && var1 != null && var1.contains(".com") && var1.length() >= 6
                && !"".equals(var2) && var2 != null && var2.length() >= 6;
    }
}
