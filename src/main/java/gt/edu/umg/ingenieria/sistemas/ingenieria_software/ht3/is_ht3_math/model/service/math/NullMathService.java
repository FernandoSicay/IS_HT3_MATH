package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.math;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseDto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseFailDto;
import org.springframework.stereotype.Service;


@Service
public class NullMathService implements IMathService{
    @Override
    public ResponseDto doOperation(float a, float b) {
        return new ResponseFailDto(200,"La operacion no es soportada, o el parametro es null");
    }
}
