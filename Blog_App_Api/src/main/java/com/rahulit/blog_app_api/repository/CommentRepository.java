package com.rahulit.blog_app_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahulit.blog_app_api.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
