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

    public User() {}
}
