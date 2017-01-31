package com.greatcall.dagger2demo.demolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.greatcall.demolibrary.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoComponent demoComponent = DaggerDemoComponent.create();
        Log.d(TAG, "foo=" + demoComponent.foo());
        Log.d(TAG, "bar=" + demoComponent.bar());
    }
}
