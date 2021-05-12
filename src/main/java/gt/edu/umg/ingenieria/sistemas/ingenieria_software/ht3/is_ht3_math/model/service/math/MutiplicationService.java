package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.math;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseDto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseSuccessDto;
import org.springframework.stereotype.Service;

@Service
public class MutiplicationService implements IMathService{
    @Override
    public ResponseDto doOperation(float a, float b) {
        return new ResponseSuccessDto(200,"success",(a*b));
    }
}
