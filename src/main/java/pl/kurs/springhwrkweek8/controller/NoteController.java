package pl.kurs.springhwrkweek8.controller;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kurs.springhwrkweek8.model.Note;
import pl.kurs.springhwrkweek8.repository.NoteRepository;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class NoteController {

    private List<Note> noteList;
    private NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteList = noteList;
        this.noteRepository = noteRepository;
    }

    @GetMapping("/note-list")
    public String getAllNotes(Model model) {
        model.addAttribute("noteList", noteRepository.findAll());
        return "noteList";
    }

    @GetMapping("/add-note")
    public String addNote(Model model) {
        model.addAttribute("note", new Note());

        return "addNote";
    }

    @PostMapping("/add-note")
    public String saveNote(@ModelAttribute Note note ) {
        if (note.getId() != null){
            note.setModifyDate(LocalDateTime.now());
        }
        noteRepository.save(note);
        return "redirect:/note-list";
    }


}
