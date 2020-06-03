package pl.kurs.springhwrkweek8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kurs.springhwrkweek8.model.Note;

public interface NoteRepository  extends JpaRepository<Note,Long> {

}
