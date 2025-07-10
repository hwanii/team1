package bitc.full502.team1.controller;

import bitc.full502.team1.DTO.CustomerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JoInController {

    @GetMapping("/join")
    public ModelAndView join() throws  Exception {
        ModelAndView mv = new ModelAndView("/join");
        return  mv;
    }

    @RequestMapping("")//join 페이지 form action 부분, 공란이라서 공란 처리 했음
    public String LoginProcess(CustomerDTO custormerDTO) throws  Exception {
        return  null;

    }


}
