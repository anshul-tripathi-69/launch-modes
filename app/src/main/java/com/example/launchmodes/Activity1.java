package com.example.launchmodes;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.launchmodes.databinding.ActivityLaunchLayoutBinding;

public class Activity1 extends AppCompatActivity {
    private static final String TAG = "LaunchModes";

    ActivityLaunchLayoutBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLaunchLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonActivity1.setOnClickListener(v -> {
            Util.startGivenActivity(this, 1);
        });

        binding.buttonActivity2.setOnClickListener(v -> {
            Util.startGivenActivity(this, 2);
        });

        binding.buttonActivity3.setOnClickListener(v -> {
            Util.startGivenActivity(this, 3);
        });

        binding.buttonActivity4.setOnClickListener(v -> {
            Util.startGivenActivity(this, 4);
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onStart() {
        super.onStart();

        Util.displayStack(this);
    }
}
