package f2.tirocinio.microlearning.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long tempoTotale;
    private Boolean completato;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "corso_id", referencedColumnName = "id")
    private Corso corso;

    @ManyToOne
    @JoinColumn(name = "lezione_id", referencedColumnName = "id")
    private Lezione lezione;

    public Activity() { }

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
}
