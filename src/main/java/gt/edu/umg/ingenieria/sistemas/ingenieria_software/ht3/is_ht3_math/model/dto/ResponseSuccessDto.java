package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto;


import org.springframework.stereotype.Component;

public class ResponseSuccessDto extends ResponseDto{
    private Object response;
    public ResponseSuccessDto(int status,String message,Object response) {
        this.status = status;
        this.message = message;
        this.response= response;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
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
