package com.safetynet.alert.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Person {
  private String firstName;
  private String lastName;
  private Address address;
  private Phone phone;
  private String email;

}
