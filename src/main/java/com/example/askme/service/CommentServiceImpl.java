package com.example.askme.service;

import com.example.askme.domain.Comment;
import com.example.askme.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public List<Comment> getAllCommentsByPostId(Long id) {

        return commentRepository.getCommentByPostId(id);


    }
}
