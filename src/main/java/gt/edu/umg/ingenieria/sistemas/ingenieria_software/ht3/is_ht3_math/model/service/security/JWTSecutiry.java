package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTSecutiry {

    @Value("${spring.security.oauth2.resourceserver.jwt.key-value}")
    private String key;

    private long now_time = new Date().getTime();


    public boolean decodeJWT(String jwt) {
        try{
            if (jwt != null && jwt.startsWith("Bearer ")) {
                jwt= jwt.substring(7);
                System.out.println(jwt);
                Claims claims = Jwts.parser()
                        .setSigningKey(key.getBytes())
                        .parseClaimsJws(jwt).getBody();
                System.out.println("Subject: " + claims.getSubject());
                System.out.println("Expiration: " + claims.getExpiration());

                if (now_time <= (claims.getExpiration().getTime())){
                    System.out.println(" token vigente");
                    return true;
                }else {
                    System.out.println("tiempo de token vencido");
                    return false;
                }
            }else{
                return false;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
