package com.benli.broadcasttest;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  Handler mHandler = new Handler();

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mHandler.postDelayed(new Runnable() {
      @Override public void run() {
        sendBroadcast(new Intent(TestReceiver.TAG));
      }
    }, 2 * 1000);
  }
}
