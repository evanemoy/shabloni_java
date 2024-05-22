package ru.practic22;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;
  private final UserRepository userRepository;
  public String savePost(Post post, Long userId){
    var user = userRepository.findById(userId).orElseThrow();
    post.setUser(user);
    postRepository.save(post);
    return post.toString();
  }

  public List<Post> getPosts(){
    return postRepository.findAll();
  }
  public void deleteById(Long postId){
    postRepository.deleteById(postId);
  }
}
