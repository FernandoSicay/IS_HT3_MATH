package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.math;


import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseDto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseFailDto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseSuccessDto;
import org.springframework.stereotype.Service;


@Service
public class DivisionService implements IMathService{

    float result;

    @Override
    public ResponseDto doOperation(float a, float b) {
        try {
            result = a / b;
            if (b == 0){
                return new ResponseFailDto(400,"NO SE PUEDE DIVIR UN NUMERO ENTRE CERO");
            }
            return new ResponseSuccessDto(200,"success",result);
        }catch (Exception e){
            return new ResponseFailDto(400,"Se produjo un error en la operacion division");
        }
    }
}
