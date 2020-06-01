package com.robelseyoum3.dagger2.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import com.robelseyoum3.dagger2.BaseActivity;
import com.robelseyoum3.dagger2.R;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "MainActivity", Toast.LENGTH_SHORT).show();
    }
}