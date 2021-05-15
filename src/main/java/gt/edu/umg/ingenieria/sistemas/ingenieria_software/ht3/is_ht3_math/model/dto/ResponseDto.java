package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto;

public class ResponseDto {

    protected int status;
    protected String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
