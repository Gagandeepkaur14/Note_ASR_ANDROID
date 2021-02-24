package com.example.note_asr_android.Models;

import java.util.List;

public class SubjectWithNotes {
    @Embedded
    public Subjects subject;

    @Relation(parentColumn = "subject_id", entityColumn = "subject_id_fk", entity = Notes.class)
    public List<Notes> notes;

}
