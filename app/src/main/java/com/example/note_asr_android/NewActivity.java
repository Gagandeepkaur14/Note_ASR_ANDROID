package com.example.note_asr_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NewActivity extends Activity {

    TextView drawer_txt, new_note, txt_title, deal_txt;
    EditText title, description;
    Button record, subject;
    RelativeLayout share_layout;
    ImageView share_pic, deal_icon;
    FrameLayout share_frame;
    String path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        drawer_txt = (TextView) findViewById(R.id.drawer_icon);
        new_note = (TextView) findViewById(R.id.new_note);
        title = (EditText) findViewById(R.id.new_title);
        txt_title = (TextView) findViewById(R.id.txt_title);
        deal_txt = (TextView) findViewById(R.id.deal_txt);
        deal_icon = (ImageView) findViewById(R.id.deal_icon);
        description = (EditText) findViewById(R.id.description);
        record = (Button) findViewById(R.id.audio);
        subject = (Button) findViewById(R.id.select_subject);
        share_layout = (RelativeLayout) findViewById(R.id.share_layout);
        share_pic = (ImageView) findViewById(R.id.share_pic);
        share_frame = (FrameLayout) findViewById(R.id.share_frame);

        drawer_txt.setVisibility(View.VISIBLE);
        drawer_txt.setText("Back");
        new_note.setText("Save");
        txt_title.setText("New Note");
        share_layout.setVisibility(View.VISIBLE);


    }
}