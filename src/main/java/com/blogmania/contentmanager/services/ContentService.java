package com.blogmania.contentmanager.services;

import com.blogmania.contentmanager.entity.ContentEntity;
import com.blogmania.contentmanager.models.ContentRequest;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public interface ContentService {

  Long createContent(ContentRequest contentRequest);

  ContentEntity getContent(Long id);

  void deleteContent(Long id);

  ContentEntity getContentByPublishDate(Long id, Date date);

  Long updateContentDetails(Long id, ContentRequest contentRequest);
}
