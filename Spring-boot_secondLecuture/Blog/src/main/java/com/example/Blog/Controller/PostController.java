package com.example.Blog.Controller;

import com.example.Blog.Entity.Post;
import com.example.Blog.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/write")
    public String write(@RequestBody String content) {
        postService.write(content);
        return content;
    }

    @GetMapping("/view")
    public List<Post> view() {
        return postService.findAll();
    }
}
