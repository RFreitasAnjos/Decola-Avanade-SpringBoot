package main.java.me.dio.renanfreitas.avanade_decola.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.me.dio.renanfreitas.avanade_decola.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        var userCreated = userService.findById(id);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
