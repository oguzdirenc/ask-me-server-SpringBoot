package com.example.askme.bootstrap;

import com.example.askme.domain.Comment;
import com.example.askme.domain.Post;
import com.example.askme.repository.CommentRepository;
import com.example.askme.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

private final CommentRepository commentRepository;
private  final PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        if(postRepository.count()==0) loadData();

    }
    public void loadData(){
        Post post = new Post();
        post.setPostUsername("jojuk");
        post.setPostTitle("agzını kırarım");
        post.setPostDescription("kolaysa kır lan");
        postRepository.save(post);

        Comment comment1 = new Comment();
        comment1.setCommentUsername("crazyjojuk");
        comment1.setCommentDescription("naber lan");
        comment1.setPost(post);
        commentRepository.save(comment1);


        Comment comment2 = new Comment();
        comment2.setCommentUsername("osmanlıtorunu");
        comment2.setCommentDescription("keserim lan");
        comment2.setPost(post);
        commentRepository.save(comment2);

    }
}
