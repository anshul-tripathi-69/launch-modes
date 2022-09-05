package com.example.launchmodes;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.List;

public class Util {

    private static final String TAG = "launch_modes";

    static void startGivenActivity(Context context, int activityNumber) {
        Intent intent = null;
        switch (activityNumber) {
            case 1:
                intent = new Intent(context, Activity1.class);
                break;
            case 2:
                intent = new Intent(context, Activity2.class);
                break;
            case 3:
                intent = new Intent(context, Activity3.class);
                break;
            case 4:
                intent = new Intent(context, Activity4.class);
                break;
        }

        if (intent != null) {
            context.startActivity(intent);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    static void displayStack(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> services = activityManager.getRunningTasks(10);
        for (int i = 0; i < services.size(); i++) {
            ActivityManager.RunningTaskInfo task = services.get(i);
            if (task.isRunning) {
                Log.d(TAG, "------------------------------------------------------------------------------------------");
                Log.d(TAG, "taskId = " + task.taskId);
                Log.d(TAG, "number of activities = " + task.numActivities);
                Log.d(TAG, "top activity = " + task.topActivity.getClassName());
                Log.d(TAG, "base activity = " + task.baseActivity.getClassName());
                Log.d(TAG, "------------------------------------------------------------------------------------------");
            }
        }
    }
}
