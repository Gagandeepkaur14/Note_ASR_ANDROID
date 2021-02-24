package com.example.note_asr_android.utils;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale;

public class ImagePicker {
    private static final int REQUEST_CODE = 100;
    private static final int GALLERY_REQUEST_CODE = 101;
    private static final int CAMERA_REQUEST_CODE = 102;
    private static final String IMAGE = "image";
    private static final String VIDEO = "video";
    private static final String OTHERS = "others";
    private String camera = "Camera", gallery = "Gallery", picture = "Picture", video = "Video", gif = "Gif", optionLabel = "Choose an option...";
    private String alert = "Alert!!!", cancel = "Cancel", openSettings = "Open Settings", ok = "Ok";
    private String permissionRequired = "Required camera and storage permission to access this functionality.";
    String[] item0 = {camera, gallery};
    Bitmap bmpPic;
    String imageAbsolutePath = " ", uid;
    private Activity mActivity;
    String destPath;

}