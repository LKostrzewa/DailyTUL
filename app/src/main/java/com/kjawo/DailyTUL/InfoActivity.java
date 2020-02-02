package com.kjawo.DailyTUL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle b = getIntent().getExtras();
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textViewBuild);
        if(b != null){
            tv.setText(b.getInt("key"));
            tv2.setText(b.getString("building"));
        }

    }


}
