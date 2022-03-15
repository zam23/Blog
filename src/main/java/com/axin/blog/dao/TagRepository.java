package com.axin.blog.dao;

import com.axin.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author X9
 * @title: TagRepository
 * @projectName blog
 * @description: TODO
 * @date 2022/1/10 20:13
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTopBy(Pageable pageable);
}
