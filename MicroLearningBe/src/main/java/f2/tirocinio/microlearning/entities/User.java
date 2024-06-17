package f2.tirocinio.microlearning.entities;

import jakarta.persistence.*;

import java.util.List;




@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private Boolean isAdmin = false;
    private Boolean isLoggedIn = false;

    @OneToMany(mappedBy = "users")
    private List<Iscrizione> iscrizioni;
    
	@OneToMany(mappedBy = "user")
	List<Attivita> attivitaUsers;
	
    public User() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(Boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public List<Iscrizione> getIscrizioni() {
		return iscrizioni;
	}

	public void setIscrizioni(List<Iscrizione> iscrizioni) {
		this.iscrizioni = iscrizioni;
	}

	public List<Attivita> getAttivitaUsers() {
		return attivitaUsers;
	}

	public void setAttivitaUsers(List<Attivita> attivitaUsers) {
		this.attivitaUsers = attivitaUsers;
	}

	
    
    
    
    
}
