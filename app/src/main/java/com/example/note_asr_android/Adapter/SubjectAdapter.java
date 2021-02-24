package com.example.note_asr_android.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubjectAdapter {

    public abstract class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.Viewholder> {

        public Context context;
        public List<Subjects> list;

        public SubjectAdapter(Context context,List<Subjects> list) {
            this.context = context;
            this.list = list;
        }

        @NonNull
        @Override
        public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemview= LayoutInflater.from(context).inflate(R.layout.subject_item,parent,false);
            return new Viewholder(itemview);

        }
        @Override
        public void onBindViewHolder(@NonNull Viewholder holder, final int position) {
            holder.delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deleteAddress(position);
                }
            });
            holder.subject.setText(list.get(position).getSubject_name());

        }
}
