package com.example.dorossy;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> myList;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        TextView selectionTextView = findViewById(R.id.selectionTextView);
        selectionTextView.setText(getIntent().getStringExtra("Teacher"));

        listView = findViewById(R.id.listView);

        myList = new ArrayList<>();
        myList.add("درس 1");
        myList.add("درس 2");
        myList.add("درس 3");
        myList.add("درس 4");
        myList.add("درس 5");

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_color_layout, myList);
        listView.setAdapter(adapter);
    }
}
