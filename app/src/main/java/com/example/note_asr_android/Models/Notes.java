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

    // private String note_image;
    private String note_audio;

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}