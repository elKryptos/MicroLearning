package f2.tirocinio.microlearning.controllers;

import f2.tirocinio.microlearning.daos.CorsoDao;
import f2.tirocinio.microlearning.daos.IscrizioneDao;
import f2.tirocinio.microlearning.daos.UserDao;
import f2.tirocinio.microlearning.dtos.IscrizioneDto;
import f2.tirocinio.microlearning.entities.Corso;
import f2.tirocinio.microlearning.entities.Iscrizione;
import f2.tirocinio.microlearning.entities.User;
import f2.tirocinio.microlearning.responses.BackendResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class IscrizioneController {

    @Autowired
    IscrizioneDao iDao;
    @Autowired
    UserDao uDao;
    @Autowired
    CorsoDao cDao;


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

    @PostMapping("/iscrizione")
    public ResponseEntity<Object> register(@RequestBody IscrizioneDto iscrizioneDto){
        User user = uDao.findById(iscrizioneDto.getUserId()).orElseThrow(() -> new RuntimeException("Utente non trovato"));
        Corso corso = cDao.findById(iscrizioneDto.getCorsoId()).orElseThrow(() -> new RuntimeException("Corso non trovato"));

        Iscrizione iscrizione = new Iscrizione();
        iscrizione.setUser(user);
        iscrizione.setCorso(corso);
        iscrizione.setDataIscrizione(System.currentTimeMillis());
        iDao.save(iscrizione);
        return ResponseEntity.status(200).body(new BackendResponse("Iscritto al corso correttamente"));
    }
}
