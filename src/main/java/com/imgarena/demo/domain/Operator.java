package com.imgarena.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Operator")
public class Operator {

  @Id
  private Integer id;

  private String name;

  private String mailingEmails;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMailingEmails() {
    return mailingEmails;
  }

  public void setMailingEmails(String mailingEmails) {
    this.mailingEmails = mailingEmails;
  }
}
