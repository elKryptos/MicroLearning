package f2.tirocinio.microlearning.controllers;

import f2.tirocinio.microlearning.daos.IscrizioneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class IscrizioneController {

    @Autowired
    IscrizioneDao iDao;

    @GetMapping("/iscrizioni")
    public ResponseEntity<Object> getMyInscription(){
        return ResponseEntity.status(200).body(iDao.findAll());
    }
}
