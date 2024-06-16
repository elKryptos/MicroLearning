package f2.tirocinio.microlearning.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "corsi")
public class Corso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String categoria;

    @OneToMany(mappedBy = "corsi")
    List<Lezione> lezioni;

    @OneToMany(mappedBy = "corsi")
    List<Iscrizione> iscrizioni;

    public Corso() { }
}
