package com.example.Blog.Repository;

import com.example.Blog.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    public Post findByContent(String content);
}
