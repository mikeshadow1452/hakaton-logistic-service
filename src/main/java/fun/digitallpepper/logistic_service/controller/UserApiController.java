package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.controller.DTO.CreateUserDTO;
import fun.digitallpepper.logistic_service.controller.DTO.JsonDTO;
import fun.digitallpepper.logistic_service.exeptions.UserAlreadyExistAuthenticationException;
import fun.digitallpepper.logistic_service.model.RoleEnum;
import fun.digitallpepper.logistic_service.model.User;
import fun.digitallpepper.logistic_service.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserApiController {
    private UserService userService;

    @PostMapping("/buyer-registration")
    public ResponseEntity<?> BuyerRegistration(@RequestBody CreateUserDTO userDTO){
        if(userService.loadUserByUsername(userDTO.getUsername()) != null){
            throw new UserAlreadyExistAuthenticationException("Юзернейм занят");
        }
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRole(RoleEnum.ROLE_BUYER);
        userService.newUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PostMapping("/seller-registration")
    public String SellerRegistration(@RequestBody CreateUserDTO userDTO){
        if(userService.loadUserByUsername(userDTO.getUsername()) != null){
            throw new UserAlreadyExistAuthenticationException("Юзернейм занят");
        }
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRole(RoleEnum.ROLE_SELLER);
        userService.newUser(user);
        return userService.newUser(user).toString();
    }

}

