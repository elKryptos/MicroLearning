package f2.tirocinio.microlearning.dtos;

public class IscrizioneDto {
    private Integer userId;
    private Integer corsoId;

    public IscrizioneDto() {}

    public IscrizioneDto(Integer userId, Integer corsoId) {
        this.userId = userId;
        this.corsoId = corsoId;
    }

    public Integer getCorsoId() {
        return corsoId;
    }

    public void setCorsoId(Integer corsoId) {
        this.corsoId = corsoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
