package com.benli.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by shibenli on 2016/9/28.
 */

public class TestReceiver extends BroadcastReceiver {
  public static final String TAG = TestReceiver.class.getName();

  @Override public void onReceive(Context context, Intent intent) {
    Intent intent1 = new Intent(context, SecondActivity.class);
    intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent1);
  }
}
