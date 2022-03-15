package com.axin.blog.service;

import com.axin.blog.po.Comment;

import java.util.List;

/**
 * @author X9
 * @title: CommentService
 * @projectName blog
 * @description: TODO
 * @date 2022/1/16 17:48
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
