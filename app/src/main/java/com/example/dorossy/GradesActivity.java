package com.example.dorossy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GradesActivity extends AppCompatActivity {

    TextView selectionTextView;
    ListView listView;
    ArrayList<String> myList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);

        selectionTextView = findViewById(R.id.selectionTextView);
        selectionTextView.setText(getIntent().getStringExtra("School"));

        listView = findViewById(R.id.listView);

        myList = new ArrayList<>();
        myList.add("الاولى ثانوي");
        myList.add("الثانية ثانوي");
        myList.add("الثالثة ثانوي");

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_color_layout, myList);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = listView.getAdapter().getItem(i).toString();
                Intent intent = new Intent(getApplicationContext(), DivisionActivity.class);
                intent.putExtra("Grade", str);
                startActivity(intent);
            }
        });
    }
}
