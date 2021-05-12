package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto;

public class ResponseDTO {

    private int status;
    private String message;
    private Object key = null;

    public ResponseDTO(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseDTO(int status, String message, Object key) {
        this.status = status;
        this.message = message;
        this.key = key;
    }

    public Object getKey() {
        return key;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
