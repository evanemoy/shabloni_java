package com.example.project14;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostController {
    private ArrayList<Post> posts = new ArrayList<>() {{
        add(new Post("Мой первый пост", "1 мая"));
        add(new Post("Мой второй пост", "2 мая"));
        add(new Post("Мой третий пост", "3 мая"));
        add(new Post("Мой четвертый пост", "4 мая"));
    }};

    @PostMapping("/posts")
    public void createPost(@RequestBody Post post) {
        posts.add(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable int id) {
        posts.removeIf(gr -> gr.getId() == id);
    }

    @GetMapping("/posts")
    public ArrayList<Post> getPosts() {
        return posts;
    }

}