package fun.digitallpepper.logistic_service.controller;

import lombok.AllArgsConstructor;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    @GetMapping("/endpoint")
    public String endpoint(Authentication auth) {
        if(auth != null) {
            return auth.toString();
        }
        else {
            return "Суччччкааа";
        }
    }
    @GetMapping("/secret")
    public String secret() {
        return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ТЫ ЗАЛОГИНЕН";
    }
}
