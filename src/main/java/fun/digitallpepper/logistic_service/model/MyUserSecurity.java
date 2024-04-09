package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
@Table(name = "Users_Data")
public class MyUserSecurity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private String roles;
}
