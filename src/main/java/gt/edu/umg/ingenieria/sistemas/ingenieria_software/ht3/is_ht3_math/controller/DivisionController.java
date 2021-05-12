package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.controller;


import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.security.JWTSecutiry;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DivisionController {


    @RequestMapping(value = "/div",method = RequestMethod.GET, produces = "application/json")
    public String div(@RequestHeader("Authorization") String authorization){
        JWTSecutiry jwtSecutiry = new JWTSecutiry();
        System.out.println(authorization);
        jwtSecutiry.decodeJWT(authorization);       
        return "hola";
    }
}
