package com.goelrishabh.simplelogin;

import android.widget.Toast;

public final class HelpersUI {

    public static void showToast(final String message) {
//        runOnMainThread(() -> {
        try {
            Toast toast = Toast.makeText(MainApplication.getMainApplication(), message, Toast.LENGTH_LONG);
            toast.setMargin(50, 50);
            toast.show();
        } catch (Throwable th) {
            // ignore
        }
//        });
    }


}
