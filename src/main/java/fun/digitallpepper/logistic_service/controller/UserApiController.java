package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.model.User;
import fun.digitallpepper.logistic_service.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserApiController {
    private UserService userService;

    @PostMapping("/add")
    public String assUser(@RequestBody User user){
        return userService.newUser(user).toString();
    }

}
