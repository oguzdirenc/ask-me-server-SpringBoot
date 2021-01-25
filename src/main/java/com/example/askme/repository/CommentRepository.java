package com.example.askme.repository;

import com.example.askme.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{

    @Query("SELECT x from Comment x where x.post.postId = :id")
    List<Comment> getCommentByPostId(Long id);
}
