package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.model.MyUserSecurity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class testController {
    @GetMapping("/welcome")
    public String welcome() {
        return "mainPage/mainPage";
    }
    @PostMapping("/new-user")
    public String addUser(@RequestBody MyUserSecurity user) {

        return "";

    }

}
