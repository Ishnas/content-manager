package com.blogmania.contentmanager.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentRequest {

  private String coverPicUrl;

  private String heading;

  private List<String> paragraph;

  private String createdBy;
}
