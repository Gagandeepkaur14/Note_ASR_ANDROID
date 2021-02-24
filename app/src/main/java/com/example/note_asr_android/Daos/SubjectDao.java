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

    /*
     * Insert the object in database
     * @param note, object to be inserted
     */
    @Insert
    void insert(Subjects subject);

    /*
     * update the object in database
     * @param note, object to be updated
     */
    @Update
    void update(Subjects repos);

    /*
     * delete the object from database
     * @param note, object to be deleted
     */
    @Delete
    void delete(Subjects subject);

    /*
     * delete list of objects from database
     * @param note, array of objects to be deleted
     */
    @Delete
    void delete(Subjects... subject);      // Note... is varargs, here note is an array

}


