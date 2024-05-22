package ru.practic19;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;
  public List<User> getUsers(){
    return userRepository.findAll();
  }
  public User findByName(String name){
    return userRepository.getUserByName(name).orElseThrow();
  }
  public User findById(Long id){
    return userRepository.findById(id).orElseThrow();
  }
  public User saveUser(User user){
    return userRepository.save(user);
  }
  public void deleteById(Long id){
    userRepository.deleteById(id);
  }
}
