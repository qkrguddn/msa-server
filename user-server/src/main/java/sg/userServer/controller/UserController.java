package sg.userServer.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sg.userServer.domain.UserEntity;
import sg.userServer.repository.UserRepository;
import sg.userServer.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user-server")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @GetMapping("")
    public String userServer() {
        return "user server ok";
    }

    @GetMapping("/services")
    public List<String> services() {
        return userService.getServices();
    }

    @GetMapping("/feign/{id}")
    public String feign(@PathVariable("id") String id) {
        return userService.feign(id);
    }

    @GetMapping("/{name}")
    public String addUser(@PathVariable("name")String name){
        userService.addUser(name);
        List<UserEntity> userEntities = userRepository.findByUserFeild1(name+"1");
        return userEntities.get(0).getUserFeild1();


    }

}