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
    private Corso corso;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

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

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
