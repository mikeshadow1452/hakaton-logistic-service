package fun.digitallpepper.logistic_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class testController {
    @GetMapping("/welcome")
    public String welcome() {
        return "mainPage/mainPage";
    }


}
