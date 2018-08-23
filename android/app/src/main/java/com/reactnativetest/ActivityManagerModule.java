package com.reactnativetest;

import android.content.Intent;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ActivityManagerModule extends ReactContextBaseJavaModule {
    @Override
    public String getName() {
        return "ActivityManagerModule";
    }

    public ActivityManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void startActivity(String params, Callback succeedCallback, Callback errorBack) {
        Intent intent = new Intent(getCurrentActivity(), LauncherActivity.class);
        intent.putExtra("params", params);
        getCurrentActivity().startActivity(intent);
        succeedCallback.invoke("succeed");
    }  @ReactMethod
    public void startActivityPromise(String params, Promise promise) {
        Intent intent = new Intent(getCurrentActivity(), LauncherActivity.class);
        intent.putExtra("params", params);
        getCurrentActivity().startActivity(intent);
        promise.resolve("promise");
    }
}
