package com.tk.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "firstname")
  private String firstname;

  @Column(name = "lastname")
  private String lastname;

  public Student(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public Student() {
  }
}
