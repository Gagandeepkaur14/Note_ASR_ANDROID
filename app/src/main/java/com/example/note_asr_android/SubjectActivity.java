package com.example.note_asr_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class SubjectActivity extends AppCompatActivity {

    TextView drawer_txt, new_note, txt_title;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        drawer_txt = (TextView) findViewById(R.id.drawer_icon);
        new_note = (TextView) findViewById(R.id.new_note);
        txt_title = (TextView) findViewById(R.id.txt_title);

        recyclerView = (RecyclerView) findViewById(R.id.note_recycler);
        drawer_txt.setVisibility(View.VISIBLE);
        drawer_txt.setText("Back");
        new_note.setText("New");
        txt_title.setText("Subjects");
        drawer_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
//                Intent i=new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(i);
            }
        });
    }
}
