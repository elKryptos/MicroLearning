package f2.tirocinio.microlearning.entities;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "lezioni")
public class Lezione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String testo;
    private String immagine;
    private Long tempo;

    @ManyToOne
    @JoinColumn(name = "corso_id", referencedColumnName = "id")
    private Corso corsi;
    
	@OneToMany(mappedBy = "lezione")
	private List<Attivita> attivitaLezioni;



	public Lezione() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}

	public Corso getCorso() {
		return corsi;
	}

	public void setCorso(Corso corsi) {
		this.corsi = corsi;
	}

	public List<Attivita> getAttivitaLezioni() {
		return attivitaLezioni;
	}

	public void setAttivitaLezioni(List<Attivita> attivitaLezioni) {
		this.attivitaLezioni = attivitaLezioni;
	}


	
    
    

}
