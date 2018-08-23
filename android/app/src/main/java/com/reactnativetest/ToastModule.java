package com.reactnativetest;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class ToastModule extends ReactContextBaseJavaModule{
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    @Override
    public String getName() {
        return "ToastExample";
    }

    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        Map<String,Object> constans = new HashMap<>();
        constans.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        constans.put(DURATION_LONG_KEY,Toast.LENGTH_LONG);
        return constans;
    }

    @ReactMethod
    public void show(String message,int duration)
        {
            Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }


}
