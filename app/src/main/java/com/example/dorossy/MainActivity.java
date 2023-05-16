package com.example.dorossy;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    ArrayList<String> myList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        add_button = findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegActivity.class);
                startActivity(intent);
                startActivity(intent);
            }
        });


        myList = new ArrayList<>();
        myList.add("ثانوية أحمد باي");
        myList.add("ثانوية محمد نجار");
        myList.add("متقن مصطفى كاتب");

        /* adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_color_layout, myList);
        recyclerView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = listView.getAdapter().getItem(i).toString();
                Intent intent = new Intent(getApplicationContext(), GradesActivity.class);
                intent.putExtra("School", str);
                startActivity(intent);
            }
        }); */
    }

}