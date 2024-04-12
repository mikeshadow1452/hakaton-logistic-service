package fun.digitallpepper.logistic_service.controller.DTO;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class CreateUserDTO {
    private String username;
    private String email;
    private String password;
}
