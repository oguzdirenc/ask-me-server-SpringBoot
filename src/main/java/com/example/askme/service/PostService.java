package com.example.askme.service;

import com.example.askme.domain.Comment;
import com.example.askme.domain.Post;

import java.util.List;

public interface PostService  {
    List<Post> getAllPosts();
    Post getById(Long id);
    Post savePost(Post post);
    Post deleteCommentById(Long id);
}
