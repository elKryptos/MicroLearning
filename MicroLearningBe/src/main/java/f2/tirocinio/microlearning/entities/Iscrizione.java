package f2.tirocinio.microlearning.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "iscrizioni")
public class Iscrizione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long dataIscrizione;

    @ManyToOne
    @JoinColumn(name = "corso_id", referencedColumnName = "id")
    private Corso corsi;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User users;

    public Iscrizione() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getDataIscrizione() {
		return dataIscrizione;
	}

	public void setDataIscrizione(Long dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	public Corso getCorsi() {
		return corsi;
	}

	public void setCorsi(Corso corsi) {
		this.corsi = corsi;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}
    
    
    
    
    
}
