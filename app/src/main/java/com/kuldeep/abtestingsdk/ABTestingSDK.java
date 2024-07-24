package com.kuldeep.abtestingsdk;

import android.util.Log;
import android.widget.Button;

public class ABTestingSDK {
    private static final String DEFAULT_BUTTON_TEXT = "Let's Go";
    private static String buttonText = DEFAULT_BUTTON_TEXT;

    public static void initialize() {
        // Here you could fetch remote config if needed
        Log.d("ABTestingSDK_Kuldeep", "initialized successfully: ");
    }

    public static void applyConfig(Button button) {
        button.setText(buttonText);
    }
}