package com.example.msi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mbt;
    private TextView mtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        mbt = (Button) findViewById(R.id.bt);
        mtv = (TextView) findViewById(R.id.tv);
    }

    public void btonclick(View view) {
        if (mtv != null) {
            mtv.setText("welcome");
        }
    }
}
