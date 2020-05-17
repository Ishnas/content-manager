package com.blogmania.contentmanager.BaseObject;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseObject implements Serializable{

  @Id
  @GeneratedValue(
      strategy = GenerationType.IDENTITY
  )
  @Column(
      length = 10
  )
  private Long id;
  @Column(
      name = "deleted"
  )
  private Boolean deleted;
  @Column(
      name = "created_at"
  )
  private ZonedDateTime createdAt;
  @Column(
      name = "updated_at"
  )
  private ZonedDateTime updatedAt;

  public BaseObject() {
    this.deleted = Boolean.FALSE;
    this.createdAt = ZonedDateTime.now();
    this.updatedAt = ZonedDateTime.now();
  }

  public Long getId() {
    return this.id;
  }

  public Boolean getDeleted() {
    return this.deleted;
  }

  public ZonedDateTime getCreatedAt() {
    return this.createdAt;
  }

  public ZonedDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public void setDeleted(final Boolean deleted) {
    this.deleted = deleted;
  }

  public void setCreatedAt(final ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(final ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
