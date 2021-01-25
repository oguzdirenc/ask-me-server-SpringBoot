package com.example.askme.bootstrap;

import ch.qos.logback.classic.sift.AppenderFactoryUsingJoran;
import com.example.askme.domain.Comment;
import com.example.askme.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/allComments/{id}")
    public ResponseEntity<List<Comment>> getComments(@PathVariable Long id){

        return new ResponseEntity<>(commentService.getAllCommentsByPostId(id), HttpStatus.OK);


    }

}
