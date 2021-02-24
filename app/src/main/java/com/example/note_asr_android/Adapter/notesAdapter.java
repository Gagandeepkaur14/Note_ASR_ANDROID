package com.example.note_asr_android.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.note_asr_android.R;

import java.util.Date;
import java.util.List;

public abstract class notesAdapter extends RecyclerView.Adapter<notesAdapter.Viewholder> {

    Context context;
    public List<Notes> notes;
    public List<Subjects> subjects;

    public notesAdapter(Context context, List<Notes> list,List<Subjects> subjects) {
        this.context = context;
        this.notes = list;
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(context).inflate(R.layout.note_item,parent,false);
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
        holder.title.setText(notes.get(position).getTitle());
        holder.description.setText(notes.get(position).getDescription());
        for(Subjects sub:subjects){
            if(sub.getSubject_id() == notes.get(position).getSubject_id_fk()){
                holder.txtSubjectItem.setText("Subject: "+sub.getSubject_name());
            }
        }

        long millisecond = notes.get(position).getCreated();
        // or you already have long value of date, use this instead of milliseconds variable.
        String dateString = DateFormat.format("MM/dd/yyyy", new Date(millisecond)).toString();
        holder.date.setText(dateString);

        if(notes.get(position).getNote_image() != null){
            holder.note_img.setVisibility(View.VISIBLE);
            Bitmap image = DataConverter.convertByteArray2Bitmap(notes.get(position).getNote_image());
            if(image != null){
                holder.note_img.setImageBitmap(image);
            }

        }
        else{
            holder.note_img.setVisibility(View.GONE);
            holder.note_img.setImageDrawable(null);
        }


    }


}
