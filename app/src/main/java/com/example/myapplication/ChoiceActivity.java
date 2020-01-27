package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChoiceActivity extends AppCompatActivity {

    static Map<String, Integer> dataSet = new HashMap<String, Integer>() {{
        put("CTI", R.string.CTI);
        put("B16", R.string.B16);
        put("Rektorat", R.string.Rektorat);
        put("Zatoka Sportu", R.string.Zatoka);
        put("Biblioteka główna", R.string.Biblio);
    }};

    public static Map<String, Integer> getDataSet(){
        return dataSet;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        ListView listView = findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<>(dataSet.keySet());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_row, arrayList);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(view.getContext(), InfoActivity.class);
                Bundle b = new Bundle();
                b.putInt("key", dataSet.get(selectedItem));

                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }





}
