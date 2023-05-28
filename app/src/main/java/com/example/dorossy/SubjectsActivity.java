package com.example.dorossy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dorossy.Adapters.SubjectsGVAdapter;
import com.example.dorossy.Models.SubjectsModel;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    GridView subjectsGridView;
    ArrayList<SubjectsModel> subjectsModelArrayList = new ArrayList<SubjectsModel>();

    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        TextView selectionTextView = findViewById(R.id.selectionTextView);
        selectionTextView.setText(getIntent().getStringExtra("Division"));

        subjectsGridView = findViewById(R.id.GridViewSubjects);

        SubjectsGVAdapter adapter = new SubjectsGVAdapter(this, subjectsModelArrayList);

        ref = FirebaseDatabase.getInstance().getReference().child("Subject");

        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                String value = snapshot.getValue(String.class);
                subjectsModelArrayList.add(new SubjectsModel(value, R.drawable.book));
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        subjectsGridView.setAdapter(adapter);

        subjectsGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = subjectsModelArrayList.get(i).getSubjectName().toString();
                Intent intent = new Intent(getApplicationContext(), TeachersActivity.class);
                intent.putExtra("Subject", str);
                startActivity(intent);
            }
        });
    }
}
