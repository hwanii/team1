package bitc.full502.team1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/login.do")
    public String login() {
        return "board/auth/login";
    }
}
