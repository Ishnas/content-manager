package com.blogmania.contentmanager.repository;

import com.blogmania.contentmanager.entity.ContentEntity;
import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<ContentEntity, Long> {

}
