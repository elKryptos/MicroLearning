package f2.tirocinio.microlearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import f2.tirocinio.microlearning.daos.LezioneDao;

@RestController
@CrossOrigin
public class LezioneController {

	@Autowired 
	LezioneDao lDao;
	
	@GetMapping("/lezioni/{id}")
	public ResponseEntity<Object> getLezioni(@PathVariable Integer id){
		return ResponseEntity.status(200).body(lDao.listaLezioni(id));
	}
}
