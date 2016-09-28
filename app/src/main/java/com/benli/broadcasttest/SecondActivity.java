package com.benli.broadcasttest;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class SecondActivity extends Activity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED| WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
    setContentView(R.layout.activity_main);

    KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KEYGUARD_SERVICE);
    KeyguardManager.KeyguardLock keyguardLock = keyguardManager.newKeyguardLock("");
    keyguardLock.disableKeyguard();
  }
}
