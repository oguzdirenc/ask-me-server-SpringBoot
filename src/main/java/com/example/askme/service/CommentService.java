package com.example.askme.service;

import com.example.askme.domain.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService {
    List<Comment> getAllCommentsByPostId(Long id);
}
