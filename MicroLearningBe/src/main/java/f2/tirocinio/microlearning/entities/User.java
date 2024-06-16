package f2.tirocinio.microlearning.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "nomi")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Boolean isAdmin = false;
    private Boolean isLoggedIn = false;

    @OneToMany(mappedBy = "users")
    private List<Iscrizione> iscrizioni;

    public User() {}
}
