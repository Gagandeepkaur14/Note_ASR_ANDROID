package com.example.note_asr_android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NewActivity extends Activity {

    private static final int CAMERA_REQUEST = 102;
    private static final int GALLARY_REQUEST = 101;
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


        drawer_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void selectImage() {
        gallery();
    }

    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
        if (reqCode == CAMERA_REQUEST && resultCode == RESULT_OK)
        {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            share_pic.setImageBitmap(photo);
            deal_icon.setVisibility(View.GONE);
            deal_txt.setVisibility(View.GONE);
        }
        else if (reqCode == GALLARY_REQUEST){
            final Uri imageUri = data.getData();
            Log.e("@#@@","get path"+data.getData());
            share_pic.setImageURI(imageUri);
            deal_icon.setVisibility(View.GONE);
            deal_txt.setVisibility(View.GONE);
        }

    }

    public void gallery() {

        final CharSequence[] items = { "Take Photo", "Choose from Library","Cancel" };
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose Your Option");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                //  boolean result= Utility.checkPermission(ShareDeal.this);

                if (items[item].equals("Take Photo")) {
                    CaptureImage();
                }
            }
        });
    }

         public void CaptureImage() {

                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }


        }