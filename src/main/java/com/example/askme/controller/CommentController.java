package com.example.askme.controller;

import com.example.askme.domain.Comment;
import com.example.askme.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/{id}")
    public ResponseEntity<Comment> saveComment(@PathVariable Long id ,@RequestBody Comment comment){
        return new ResponseEntity<>(commentService.saveCommentsByPostId(id,comment), HttpStatus.CREATED);
    }

    @GetMapping("/allComments/{id}")
    public ResponseEntity<List<Comment>> getComments(@PathVariable Long id){

        return new ResponseEntity<>(commentService.getAllCommentsByPostId(id), HttpStatus.OK);
    }



}
