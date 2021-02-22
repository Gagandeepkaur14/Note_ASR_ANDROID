package com.example.note_asr_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView drawer_txt,new_note,txt_title;
    ImageView search_icon;
    EditText search;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer_txt=(TextView)findViewById(R.id.drawer_icon);
        txt_title=(TextView)findViewById(R.id.txt_title);
        new_note=(TextView)findViewById(R.id.new_note);
        search=(EditText) findViewById(R.id.search_txt);
        search_icon=(ImageView) findViewById(R.id.search_icon);
        recyclerView=(RecyclerView) findViewById(R.id.note_recycler);
        drawer_txt.setVisibility(View.GONE);
        new_note.setText("New");
        txt_title.setText("Notes");


        new_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),NewActivity.class);
                startActivity(i);
            }
        });
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

    }

}