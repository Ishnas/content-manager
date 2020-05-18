package com.blogmania.contentmanager.repository;

import com.blogmania.contentmanager.entity.ContentEntity;
import java.util.Date;
import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<ContentEntity, Long> {

  ContentEntity findByIdAndDeletedFalse(Long id);

  ContentEntity findByIdAndCreatedAt(Long id, Date date);
}
