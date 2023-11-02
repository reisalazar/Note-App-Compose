package com.example.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.noteapp.data.NotesDataSource
import com.example.noteapp.model.Note

class NoteViewModel: ViewModel() {
    var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNote())
    }

    fun addNote(note:Note) {
        noteList.add(note)
    }
    fun removeNote(note: Note) {
        noteList.remove(note)
    }

    fun getAllNotes() :List<Note> {
        return noteList
    }
}