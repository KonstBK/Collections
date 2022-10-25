package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private final static List<Note> phoneBook = new ArrayList<>();

    public void add(Note note){
        phoneBook.add(note);
    }

    public Note find(String name){
        Note findedNote = null;
        for (Note note: phoneBook){
            if (note.getName().equals(name)) {
                findedNote = note;
            }
        }
        return findedNote;
    }

    public List<Note> findAll(String name){
        List<Note> findedNotes = new ArrayList<>();
        for (Note note: phoneBook){
            if (note.getName().equals(name)){
                findedNotes.add(note);
            }
        }
        return findedNotes;
    }

    public static List<Note> getPhoneBook() {
        return phoneBook;
    }
}
