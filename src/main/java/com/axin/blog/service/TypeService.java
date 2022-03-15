package com.axin.blog.service;

import com.axin.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author X9
 * @title: TypeService
 * @projectName blog
 * @description: TODO
 * @date 2022/1/8 0:12
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type getTypeByName(String name);

    Type updateType(Long id,Type type);

    void deleteType(Long id);

}
