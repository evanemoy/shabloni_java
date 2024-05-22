package ru.practic24;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
  private final PostService postService;
  private final UserService userService;

  @PostMapping("/{userId}")
  @ResponseBody
  public String createPost(@RequestBody Post post, @PathVariable("userId") Long userId) {
    var user = userService.findById(userId);
    post.setUser(user);
    postService.savePost(post, user.getId());
    return post.toString();
  }

  @GetMapping("/")
  @ResponseBody
  public List<String> getAllPosts() {
    return postService.getPosts().stream().map(Post::toString).collect(Collectors.toList());
  }

  @DeleteMapping("/{id}")
  @ResponseBody
  public void deletePost(@PathVariable long id) {
    postService.deleteById(id);
  }
}
