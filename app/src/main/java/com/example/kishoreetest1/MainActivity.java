package com.example.kishoreetest1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.appsflyer.AppsFlyerLib;
import android.app.Application;
import android.view.View;
import android.widget.Button;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_track_event);

        // Initialize AppsFlyer SDK with your developer key
        AppsFlyerLib.getInstance().init("CpYt7yYGtdMfBHMPqBohs7", null, this);

        // Start the SDK
        AppsFlyerLib.getInstance().start(this);

        AppsFlyerLib.getInstance().setDebugLog(true);


    }}




