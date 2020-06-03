package pl.kurs.springhwrkweek8;

import org.springframework.stereotype.Component;
import pl.kurs.springhwrkweek8.model.Note;
import pl.kurs.springhwrkweek8.repository.NoteRepository;

@Component
public class Start {

    private NoteRepository noteRepository;

    public Start(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;

//        initDb();
    }

    public void initDb(){
        System.out.println("Inicjuję tabelę notes");

        Note note1 = new Note("Notatka - 1","Zawartość 1");
        Note note2 = new Note("Notatka - 2","Zawartość 2");
        Note note3 = new Note("Notatka - 3","Zawartość 3");
        Note note4 = new Note("Notatka - 4","Zawartość 4");

        noteRepository.save(note1);
        noteRepository.save(note2);
        noteRepository.save(note3);
        noteRepository.save(note4);
    }
}
