package com.example.dorossy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dorossy.Adapters.SubjectsGVAdapter;
import com.example.dorossy.Models.SubjectsModel;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    GridView subjectsGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        TextView selectionTextView = findViewById(R.id.selectionTextView);
        selectionTextView.setText(getIntent().getStringExtra("Division"));

        subjectsGridView = findViewById(R.id.GridViewSubjects);

        ArrayList<SubjectsModel> subjectsModelArrayList = new ArrayList<SubjectsModel>();

        subjectsModelArrayList.add(new SubjectsModel("رياضيات", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("فيزياء", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("علوم الطبيعة", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("أدب عربي", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("اجتماعيات", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("فرنسية", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("انجليزية", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("تربية اسلامية", R.drawable.book));
        subjectsModelArrayList.add(new SubjectsModel("تربية بدنية", R.drawable.book));

        SubjectsGVAdapter adapter = new SubjectsGVAdapter(this, subjectsModelArrayList);
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
