package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto;

import org.springframework.stereotype.Component;

public class ResponseFailDto  extends ResponseDto{
    public ResponseFailDto(int status,String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public int getStatus() {
        return super.getStatus();
    }

    @Override
    public void setStatus(int status) {
        super.setStatus(status);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void setMessage(String message) {
        super.setMessage(message);
    }
}
