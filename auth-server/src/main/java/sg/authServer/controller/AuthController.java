package sg.authServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/auth-server")
public class AuthController {

        @GetMapping("")
        public String authServer() {
            return  "auth server ok";
        }
}
