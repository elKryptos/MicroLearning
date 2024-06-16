package f2.tirocinio.microlearning.responses;

public class BackendResponse {

    private String message;

    public BackendResponse(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessagge(String message) {
        this.message = message;
    }
}
