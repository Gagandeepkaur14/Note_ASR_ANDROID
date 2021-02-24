package com.example.note_asr_android.utils;

import android.app.Activity;
import android.graphics.Bitmap;

public class ImagePicker {
    private static final int REQUEST_CODE = 100;
    private static final int GALLERY_REQUEST_CODE = 101;
    private static final int CAMERA_REQUEST_CODE = 102;
    private static final String IMAGE = "image";
    private static final String VIDEO = "video";
    private static final String OTHERS = "others";
    private String camera = "Camera", gallery = "Gallery",picture = "Picture",video = "Video",gif = "Gif", optionLabel = "Choose an option...";
    private String alert = "Alert!!!", cancel = "Cancel", openSettings = "Open Settings", ok = "Ok";
    private String permissionRequired = "Required camera and storage permission to access this functionality.";
    String[] item0 = {camera, gallery};
    Bitmap bmpPic;
    String imageAbsolutePath = " ", uid;
    private Activity mActivity;
    String destPath;
}
