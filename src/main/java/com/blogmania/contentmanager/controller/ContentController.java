package com.blogmania.contentmanager.controller;

import com.blogmania.contentmanager.entity.ContentEntity;
import com.blogmania.contentmanager.models.ContentRequest;
import com.blogmania.contentmanager.services.ContentService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContentController {

   @Autowired
   ContentService contentService;


   @PostMapping
   public Long createContent(@RequestBody ContentRequest contentRequest) {
      Long id = contentService.createContent(contentRequest);
      return id;
   }

   @GetMapping("/{id}")
   public ContentEntity getContent(@PathVariable("id") Long id) {
      ContentEntity contentEntity = contentService.getContent(id);
      return contentEntity;
   }

   @DeleteMapping("/{id}")
   public void deleteContent(@PathVariable("id") Long id) {
      contentService.deleteContent(id);
   }

   @GetMapping("/{id}/{created_at}")
   public ContentEntity getContentByPublishDate(@PathVariable("id") Long id, @PathVariable("created_at") Date date) {
      ContentEntity contentEntity = contentService.getContentByPublishDate(id, date);
      return contentEntity;
   }

   @PostMapping("/{id}")
   public Long updateContentDetails(Long id, ContentRequest contentRequest) {
      Long contentId = contentService.updateContentDetails(id, contentRequest);
      return contentId;
   }

}
