package bitc.full502.team1.controller;

import bitc.full502.team1.DTO.CustomerDTO;
import bitc.full502.team1.service.JoinService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
public class JoInController {


    @Autowired
    private JoinService joinService;


    public JoInController(JoinService joinService) {
        this.joinService = joinService;
    }

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }

    @GetMapping("/join")
    public ModelAndView join() throws  Exception {
        ModelAndView mv = new ModelAndView("/join");
        return  mv;
    }

    @RequestMapping("/joinProcess")//join 페이지 form action 부분, 공란이라서 공란 처리 했음
    public String JoinProcess(@ModelAttribute CustomerDTO cdto) throws  Exception {

        joinService.joinUser(cdto);
        return "redirect:/index"; // 메인으로 이동 , 페이지 나중에 적어야됨
    }

}
