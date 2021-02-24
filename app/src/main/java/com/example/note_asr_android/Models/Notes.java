package com.example.note_asr_android.Models;

@Entity(foreignKeys = @ForeignKey(entity = Subjects.class,parentColumns = "subject_id",childColumns = "subject_id_fk",onDelete = CASCADE))
public class Notes {
    @PrimaryKey(autoGenerate = true)
    private int note_id;
    private String description;
    private String title;
    private double latitude;
    private double longitude;
    private long created;
    private int subject_id_fk;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] note_image;
}