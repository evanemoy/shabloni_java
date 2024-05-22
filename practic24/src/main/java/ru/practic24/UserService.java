package ru.practic24;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
  private final UserRepository userRepository;
  public List<User> getUsers(){
    log.info("finding all users");
    return userRepository.findAll();
  }

  public User findByName(String name){
    log.info("finding user by name");
    return userRepository.getUserByName(name).orElseThrow();
  }
  public User findById(Long id){
    log.info("finding user by id");
    return userRepository.findById(id).orElseThrow();
  }
  public User saveUser(User user){
    log.info("saving user");
    return userRepository.save(user);
  }

  public void deleteById(Long id){
    log.info("deleting user");
    userRepository.deleteById(id);
  }
}
