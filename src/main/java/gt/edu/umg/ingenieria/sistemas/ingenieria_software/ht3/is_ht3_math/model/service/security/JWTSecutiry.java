package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.security;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.exception.CustomException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;

import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JWTSecutiry {

    @Value("${spring.security.oauth2.resourceserver.jwt.key-value}")
    private String key;

    private int id;
    private String subject;
    private String issuerM;
    private Date expiration;
    private Date now_time;

    private int timeExpire;


    public boolean decodeJWT(String jwt) {

        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(key))
                .parseClaimsJws(jwt).getBody();
        expiration = claims.getExpiration();

        System.out.println("ID: " + claims.getId());
        System.out.println("Subject: " + claims.getSubject());
        System.out.println("Issuer: " + claims.getIssuer());
        System.out.println("Expiration: " + claims.getExpiration());

        return true;
    }
}
