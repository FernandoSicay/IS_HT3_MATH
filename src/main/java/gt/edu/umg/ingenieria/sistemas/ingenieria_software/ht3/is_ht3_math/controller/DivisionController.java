package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.controller;


import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseDto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.dto.ResponseFailDto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.math.IMathService;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.is_ht3_math.model.service.math.MathFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DivisionController {

    @Autowired
    MathFactoryService mathFactoryService;

    @RequestMapping(value = "/div",method = RequestMethod.GET, produces = "application/json")
    public ResponseDto div(@RequestHeader("Authorization") String token, HttpServletRequest request) {
        System.out.println(token);

        IMathService mathService= mathFactoryService.getMathService("div",token);

        return mathService.doOperation(
                Integer.parseInt(request.getParameter("a")),
                Integer.parseInt(request.getParameter("b")));
    }
}
