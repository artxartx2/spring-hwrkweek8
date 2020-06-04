package pl.kurs.springhwrkweek8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kurs.springhwrkweek8.model.Note;
@Repository
public interface NoteRepository  extends JpaRepository<Note,Long> {

}
