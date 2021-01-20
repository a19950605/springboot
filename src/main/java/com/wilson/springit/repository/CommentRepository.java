package com.wilson.springit.repository;

import com.wilson.springit.domain.Comment;
import com.wilson.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {


}