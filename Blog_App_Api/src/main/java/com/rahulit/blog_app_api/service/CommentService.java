package com.rahulit.blog_app_api.service;

import com.rahulit.blog_app_api.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto ,Integer postId);
	
	void deleteComment(Integer commentId);

}
