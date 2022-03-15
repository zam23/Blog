package com.axin.blog.dao;

import com.axin.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author X9
 * @title: CommentRepository
 * @projectName blog
 * @description: TODO
 * @date 2022/1/16 17:50
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
