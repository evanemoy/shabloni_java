package ru.practic24;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ServicesTest {
  @Mock
  private UserRepository userRepository;
  @Mock
  private PostRepository postRepository;
  @InjectMocks
  private UserService userService;
  @InjectMocks
  private PostService postService;

  @Test
  public void getUsers() {
    List<User> users = new ArrayList<>();
    users.add(new User(Long.valueOf(1), "Eva", "Nemoykina", null));
    users.add(new User(Long.valueOf(2), "Eva1", "Nemoykina1", null));

    Mockito.when(userRepository.findAll()).thenReturn(users);

    Iterable<User> userIterable = userService.getUsers();
    List<User> userList = new ArrayList<>();
    userIterable.forEach(userList::add);
    assertEquals(2, userList.size());
  }

  @Test
  public void addUser() {
    User user = new User(Long.valueOf(2), "Eva1", "Nemoykina1", null);
    Mockito.when(userRepository.save(user)).thenReturn(user);

    assertEquals(user, userService.saveUser(user));
  }

  @Test
  public void deleteUser() {
    long userId = 1;

    Mockito.doNothing().when(userRepository).deleteById(userId);

    Assertions.assertDoesNotThrow(() -> userService.deleteById(userId));
  }

  @Test
  public void getUserByName() {
    String userName = "Eva";
    User user = new User(Long.valueOf(1), userName, "Nemoykina", null);


    Mockito.when(userRepository.getUserByName(userName)).thenReturn(Optional.of(user));

    User result = userService.findByName(userName);

    assertEquals(user, result);
  }

  @Test
  public void getPosts() {
    List<Post> posts = new ArrayList<>();
    posts.add(new Post(Long.valueOf(1), "1 May", "First", null));
    posts.add(new Post(Long.valueOf(2), "2 May", "Second", null));

    Mockito.when(postRepository.findAll()).thenReturn(posts);

    Iterable<Post> postsIterable = postService.getPosts();
    List<Post> postsList = new ArrayList<>();
    postsIterable.forEach(postsList::add);
    assertEquals(2, postsList.size());
  }


  @Test
  public void deleteSubject() {
    long postId = 1;

    Mockito.doNothing().when(postRepository).deleteById(postId);

    Assertions.assertDoesNotThrow(() -> postService.deleteById(postId));
  }


}

