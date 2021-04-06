package fr.esiea.ex4A.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @PostMapping("/api/inscription")
    UserData inscription(@RequestBody UserData user){
        userRepository.save(user);
        return user;
    }

    @GetMapping(path = "/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserRepository.Match> getMatches(@RequestParam(required = true) String userName,
                                          @RequestParam(required = true) String userCountry){
        System.out.println(userName + " " + userCountry);
        return userRepository.getMatches(userName, userCountry);
    }
}
