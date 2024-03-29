package com.client;

import android.app.Application;
import android.util.Log;

import com.airbnb.android.react.maps.BuildConfig;
import com.facebook.react.PackageList;
import com.facebook.hermes.reactexecutor.HermesExecutorFactory;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.ReactApplication;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.imagepicker.ImagePickerPackage;
//import in.sriraman.sharedpreferences.RNSharedPreferencesReactPackage;
import com.makemytrip.sharedpref.RNSharedPreferencesPackage;
import com.dooboolab.naverlogin.RNNaverLoginPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.ocetnik.timer.BackgroundTimerPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.reactnativecommunity.geolocation.GeolocationPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
              new MainReactPackage(),
            new RNFetchBlobPackage(),
            new ImagePickerPackage(),
//            new RNSharedPreferencesReactPackage(),
            new RNCWebViewPackage(),
            new BackgroundTimerPackage(),
            new RNGestureHandlerPackage(),
            new GeolocationPackage(),
            new RNNaverLoginPackage(),
              new RNSharedPreferencesPackage(),
              new MapsPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
