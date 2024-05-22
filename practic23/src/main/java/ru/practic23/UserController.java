package ru.practic23;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping("/")
  public User createUser(@RequestBody User user) {return userService.saveUser(user);}

  @GetMapping("/{name}")
  public User getByName(@PathVariable("name") String name){return userService.findByName(name);}
  @GetMapping("/")
  public List<User> getAllUsers() {
    return userService.getUsers();
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable long id) {
    userService.deleteById(id);
  }

}
