package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class ChoiceActivity extends AppCompatActivity {

    private String[] myDataset;

    private void fillDataSet(){
        myDataset = new String[] {"CTI","B16", "Rektorat"};
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillDataSet();
        setContentView(R.layout.activity_choice);
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(Arrays.asList(myDataset));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_row, arrayList);

        listView.setAdapter(adapter);



        //TODO: Naprawić to trzeba bo błąd wyrzuca
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(view.getContext(), InfoActivity.class);
                startActivity(intent);


            }
        });*/
    }





}
