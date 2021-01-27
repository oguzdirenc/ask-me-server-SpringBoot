package com.example.askme.controller;

import com.example.askme.domain.Comment;
import com.example.askme.domain.Post;
import com.example.askme.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;


    @GetMapping("/allPosts")
    public ResponseEntity<List<Post>> getPosts(){

        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Post> savePost(@RequestBody Post post){
        return new ResponseEntity<>(postService.savePost(post),HttpStatus.CREATED);
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<Post> showPost(@PathVariable Long id){
        return new ResponseEntity<>(postService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Post>  deleteComments(@PathVariable Long id){
        return new ResponseEntity<>(postService.deleteCommentById(id), HttpStatus.OK);
    }
}
