package f2.tirocinio.microlearning.controllers;

import f2.tirocinio.microlearning.daos.CorsoDao;
import f2.tirocinio.microlearning.entities.Corso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class CorsoController {

    @Autowired
    CorsoDao cDao;

    @GetMapping("/all")
    public ResponseEntity<Object> all(){
        return ResponseEntity.status(200).body(cDao.findAll());
    }
    @GetMapping("/categorie")
    public ResponseEntity<Object> allCategorie(){
        List<String> categorie = cDao.findDistinctCategorie();
        return ResponseEntity.status(200).body(categorie);
    }

    @GetMapping("/{categoria}")
    public ResponseEntity<Object> getByCategoria(@PathVariable String categoria){
        return ResponseEntity.status(200).body(cDao.findByCategoria(categoria));
    }


    @GetMapping("/{categoria}/{nome}")
    public ResponseEntity<Object> findByCategoriaAndNome(@PathVariable String categoria, @PathVariable String nome){
        nome = nome.replace("-", " ");
        return ResponseEntity.status(200).body(cDao.findByCategoriaAndNome(categoria, nome));
    }

    @GetMapping("/corsi")
    public ResponseEntity<Object> getAllWithLezioni(){
        List<Corso> corsi = cDao.findAllWithLezioni();
        return ResponseEntity.status(200).body(corsi);
    }
}
