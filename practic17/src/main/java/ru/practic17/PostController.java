package ru.practic17;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
  private final PostRepository postRepository;
  private final UserRepository userRepository;

  @PostMapping("/{userId}")
  @ResponseBody
  public String createPost(@RequestBody Post post, @PathVariable("userId") Long userId) {
    var user = userRepository.findById(userId).orElseThrow();
    post.setUser(user);
    postRepository.save(post);
    return post.toString();
  }

  @GetMapping("/")
  @ResponseBody
  public List<String> getAllPosts() {
    return postRepository.findAll().stream().map(Post::toString).collect(Collectors.toList());
  }

  @DeleteMapping("/{id}")
  @ResponseBody
  public void deletePost(@PathVariable long id) {
    postRepository.deleteById(id);
  }
}
