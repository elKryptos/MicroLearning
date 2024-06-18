package f2.tirocinio.microlearning.controllers;

import f2.tirocinio.microlearning.daos.CorsoDao;
import f2.tirocinio.microlearning.daos.IscrizioneDao;
import f2.tirocinio.microlearning.daos.UserDao;
import f2.tirocinio.microlearning.entities.Corso;
import f2.tirocinio.microlearning.entities.Iscrizione;
import f2.tirocinio.microlearning.entities.User;
import f2.tirocinio.microlearning.responses.BackendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    IscrizioneDao iDao;
    @Autowired
    UserDao uDao;
    @Autowired
    CorsoDao cDao;

}
