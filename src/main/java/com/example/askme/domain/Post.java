package com.example.askme.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String postUsername;
    private String postTitle;
    private String postDescription;

    @OneToMany(mappedBy = "post" ,cascade = CascadeType.ALL)
    private List<Comment> commentList = new ArrayList<>();
}
