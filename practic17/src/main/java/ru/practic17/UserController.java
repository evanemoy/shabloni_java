package ru.practic17;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
  private final UserRepository userRepository;

  @PostMapping("/")
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }

  @GetMapping("/{name}")
  public User getByName(@PathVariable("name") String name){
    return userRepository.getUserByName(name).orElseThrow();
  }
  @GetMapping("/")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable long id) {
    userRepository.deleteById(id);
  }

}
