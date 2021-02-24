package com.example.note_asr_android.Daos;

import com.example.note_asr_android.Models.Subjects;

import java.util.List;

public interface SubjectDao {
    @Query("SELECT * FROM Subjects ")
    List<SubjectsWithNotes> loadSubjectsWithNotes();

    @Query("SELECT * FROM Subjects ")
    List<Subjects> getAll();

    @Query("SELECT * FROM Subjects WHERE subject_id = :id")
    List<Subjects> getSubject(int id);


}
