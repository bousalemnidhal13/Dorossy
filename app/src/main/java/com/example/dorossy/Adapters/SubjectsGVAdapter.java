package com.example.dorossy.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dorossy.R;
import com.example.dorossy.Models.SubjectsModel;

import java.util.ArrayList;

public class SubjectsGVAdapter extends ArrayAdapter<SubjectsModel>{

    public SubjectsGVAdapter(@NonNull Context context, ArrayList<SubjectsModel> subjectsModelsArrayList) {
        super(context, 0, subjectsModelsArrayList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }

        SubjectsModel subjectsModel = getItem(position);
        TextView subjectsTV = listItemView.findViewById(R.id.TVSubjects);
        ImageView subjectsIV = listItemView.findViewById(R.id.IVsubjects);

        subjectsTV.setText(subjectsModel.getSubjectName());
        subjectsIV.setImageResource(subjectsModel.getImgId());

        return listItemView;
    }

}
