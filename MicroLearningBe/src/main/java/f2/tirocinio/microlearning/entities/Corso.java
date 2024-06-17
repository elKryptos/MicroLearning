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

    @OneToMany(mappedBy = "corso")
    List<Lezione> lezioni;

    @OneToMany(mappedBy = "corso")
    List<Iscrizione> iscrizioni;

    public Corso() { }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Lezione> getLezioni() {
        return lezioni;
    }

    public void setLezioni(List<Lezione> lezioni) {
        this.lezioni = lezioni;
    }

    public List<Iscrizione> getIscrizioni() {
        return iscrizioni;
    }

    public void setIscrizioni(List<Iscrizione> iscrizioni) {
        this.iscrizioni = iscrizioni;
    }
}
