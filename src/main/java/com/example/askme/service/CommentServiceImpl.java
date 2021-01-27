package com.example.askme.service;

import com.example.askme.domain.Comment;
import com.example.askme.domain.Post;
import com.example.askme.repository.CommentRepository;
import com.example.askme.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Override
    public List<Comment> getAllCommentsByPostId(Long id) {

        return commentRepository.getCommentByPostId(id);


    }

    @Override
    public Comment saveCommentsByPostId(Long id, Comment comment) {
        Post post = new Post();
        Optional<Post> newPost = postRepository.findById(id);
        if(newPost.isPresent()) post = newPost.get();
        comment.setPost(post);

        return commentRepository.save(comment);
    }


}
