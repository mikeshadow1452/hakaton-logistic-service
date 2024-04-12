package fun.digitallpepper.logistic_service.controller;

import lombok.AllArgsConstructor;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private ResourceLoader resourceLoader;
    @GetMapping("/endpoint")
    public String endpoint(Authentication auth) {
        if(auth != null) {
            return auth.toString();
        }
        else {
            return "Фу, аноним";
        }
    }
    @GetMapping("/secret")
    public ResponseEntity<?> secret() throws IOException {
        String htmlContent = resourceLoader.getResource("classpath:static/src/mainPage/mainPage.html").getContentAsString(StandardCharsets.UTF_8);
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(htmlContent);
    }
}
