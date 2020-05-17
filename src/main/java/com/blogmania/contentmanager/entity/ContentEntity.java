package com.blogmania.contentmanager.entity;

import com.blogmania.contentmanager.BaseObject.BaseObject;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "content-manager")
@AllArgsConstructor
@NoArgsConstructor
public class ContentEntity extends BaseObject {

  @Column(name = "cover_pic_url", length = 500)
  private String coverPicUrl;

  @Column(name = "heading", length = 50)
  private String heading;

  @Column(name = "paragraph", length = 1000)
  private List<String> paragraph;

  @Column(name = "created_by", length = 100)
  private String createdBy;

}
