package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.exception;

import io.jsonwebtoken.JwtException;
import org.springframework.http.HttpStatus;

public class CustomException extends JwtException {
    private String message;
    private HttpStatus status;

    public CustomException(String message, String message1, HttpStatus status) {
        super(message);
        this.message = message1;
        this.status = status;
    }

    public CustomException(String message, Throwable cause, String message1, HttpStatus status) {
        super(message, cause);
        this.message = message1;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

}
