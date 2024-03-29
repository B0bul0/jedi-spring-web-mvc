package me.bruno.estudo.aulaspringwebmvc.resource;

import me.bruno.estudo.aulaspringwebmvc.model.Jedi;
import me.bruno.estudo.aulaspringwebmvc.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class JediResource {

    @Autowired
    private JediService jediService;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi() {
        return jediService.findAll();
    }

    @GetMapping("/api/jedi/{id}")
    public ResponseEntity<Jedi> getJedi(@PathVariable("id") Long id) {
        Jedi jedi = jediService.findById(id);

        return ResponseEntity.ok(jedi);
    }

    @PostMapping("/api/jedi")
    @ResponseStatus(HttpStatus.CREATED)
    public Jedi createJedi(@Valid @RequestBody Jedi jedi) {
        return jediService.save(jedi);
    }

    @PutMapping("/api/jedi/{id}")
    public ResponseEntity<Jedi> updateJedi(@PathVariable("id") Long id, @Valid @RequestBody Jedi jediDto) {
        Jedi jediEntity = jediService.update(id, jediDto);

        return ResponseEntity.ok(jediEntity);
    }

    @DeleteMapping("/api/jedi/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeJedi(@PathVariable("id") Long id) {
        jediService.deleteById(id);
    }

}
