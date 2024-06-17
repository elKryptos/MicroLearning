package f2.tirocinio.microlearning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "attivita")

public class Attivita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Long tempoTotale;
	private Boolean completato = false;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id" )
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "corso_id", referencedColumnName = "id")
	private Corso corso;
	
	@ManyToOne
	@JoinColumn(name = "lezione_id", referencedColumnName = "id")
	private Lezione lezione;
	
    public Attivita(Integer id, Long tempoTotale, Boolean completato, User user, Corso corso, Lezione lezione) {
		super();
		this.id = id;
		this.tempoTotale = tempoTotale;
		this.completato = completato;
		this.user = user;
		this.corso = corso;
		this.lezione = lezione;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getTempoTotale() {
		return tempoTotale;
	}

	public void setTempoTotale(Long tempoTotale) {
		this.tempoTotale = tempoTotale;
	}

	public Boolean getCompletato() {
		return completato;
	}

	public void setCompletato(Boolean completato) {
		this.completato = completato;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Corso getCorso() {
		return corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}

	public Lezione getLezione() {
		return lezione;
	}

	public void setLezione(Lezione lezione) {
		this.lezione = lezione;
	}



	// toString method for debugging
    @Override
    public String toString() {
        return "Attivita{" +
                "id=" + id +
                ", tempoTotale=" + tempoTotale +
                ", completato=" + completato +
                ", user=" + user +
                ", corso=" + corso +
                ", lezione=" + lezione +
                '}';
    }

	
	
}
