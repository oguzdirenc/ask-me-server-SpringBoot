package com.example.askme.service;

import com.example.askme.domain.Post;
import com.example.askme.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {

        return postRepository.findAll();
    }

    @Override
    public Post getById(Long id) {
        Optional<Post> postOptional = postRepository.findById(id);

        if (postOptional.isPresent()) return postOptional.get();

    return null;

    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}