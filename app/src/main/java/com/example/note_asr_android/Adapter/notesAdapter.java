package com.example.note_asr_android.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.note_asr_android.R;

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

}
