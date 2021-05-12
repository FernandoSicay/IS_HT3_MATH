package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.math;


import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.security.JWTSecutiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MathFactoryService {

    @Autowired
    DivisionService divisionService;

    @Autowired
    SumService sumService;
    @Autowired
    MutiplicationService mutiplicationService;

    @Autowired
    SubtractionService subtractionService;

    @Autowired
    NullMathService nullMathService;

    @Autowired
    JWTSecutiry jwtSecutiry;

    public IMathService getMathService(String operacion, String token){
        if (operacion == null ||  jwtSecutiry.decodeJWT(token) == false){
            return  nullMathService;
        }
        switch (operacion){
            case "sum":
                return sumService;
            case "sub":
                return subtractionService;
            case "mult":
                return mutiplicationService;
            case "div":
                return divisionService;
            default:
                return nullMathService;
        }
    }

}
