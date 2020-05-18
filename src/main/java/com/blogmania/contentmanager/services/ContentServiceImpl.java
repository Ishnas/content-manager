package com.blogmania.contentmanager.services;

import com.blogmania.contentmanager.entity.ContentEntity;
import com.blogmania.contentmanager.models.ContentRequest;
import com.blogmania.contentmanager.repository.ContentRepository;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentServiceImpl implements ContentService {

  @Autowired
  ContentRepository contentRepository;

  @Override
  public Long createContent(ContentRequest contentRequest) {

    ContentEntity contentEntity = new ContentEntity();
//    contentEntity.setCoverPicUrl(contentRequest.getCoverPicUrl());
//    contentEntity.setCreatedBy(contentRequest.getCreatedBy());
//    contentEntity.setHeading(contentRequest.getHeading());
//    contentEntity.setParagraph(contentRequest.getParagraph());

    BeanUtils.copyProperties(contentEntity, contentRequest);
    contentEntity = contentRepository.save(contentEntity);
    return contentEntity.getId();
  }

  @Override
  public ContentEntity getContent(Long id) {
    ContentEntity contentEntity = contentRepository.findByIdAndDeletedFalse(id);
    return contentEntity;
  }



  @Override
  public void deleteContent(Long id) {
    ContentEntity contentEntity = contentRepository.findByIdAndDeletedFalse(id);
    contentEntity.setDeleted(true);
    contentRepository.save(contentEntity);
  }

  @Override
  public ContentEntity getContentByPublishDate(Long id, Date date) {
    ContentEntity contentEntity = contentRepository.findByIdAndCreatedAt(id, date);
    return contentEntity;
  }

  @Override
  public Long updateContentDetails(Long id, ContentRequest contentRequest) {

   ContentEntity contentEntity = contentRepository.findByIdAndDeletedFalse(id);

   ContentEntity contentEntitynew = new ContentEntity();
   BeanUtils.copyProperties( contentEntitynew, contentRequest);
   contentEntity.setId(id);
   contentEntitynew = contentRepository.save(contentEntitynew);
   return contentEntitynew.getId();
  }
}
