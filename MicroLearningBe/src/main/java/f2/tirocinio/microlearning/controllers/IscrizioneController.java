package f2.tirocinio.microlearning.controllers;

import f2.tirocinio.microlearning.daos.IscrizioneDao;
import f2.tirocinio.microlearning.entities.Iscrizione;
import f2.tirocinio.microlearning.responses.BackendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@CrossOrigin
public class IscrizioneController {

    @Autowired
    IscrizioneDao iDao;

    @GetMapping("/iscrizioni")
    public ResponseEntity<Object> getMyInscription(){
        return ResponseEntity.status(200).body(iDao.findAll());
    }

    @GetMapping("/iscrizioni/{user_id}")
    public ResponseEntity<Object> getIscrizioni(@PathVariable int user_id){
        List<Iscrizione> iscrizioni = iDao.findByUserID(user_id);
        if(iscrizioni.isEmpty() || iscrizioni == null){
            return ResponseEntity.status(200).body(new BackendResponse("Non hai ancora " +
                    "aggiunto un corso alla tua lista"));
        }
        return ResponseEntity.status(200).body(iscrizioni);
    }
}
