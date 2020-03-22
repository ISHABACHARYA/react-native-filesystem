package com.benwixen.rnfilesystem;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Collections;
import java.util.List;

public class RNFileSystemPackage implements ReactPackage {
 
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return Collections.<NativeModule>singletonList(new RNFileSystem(reactContext));
  }

  
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
