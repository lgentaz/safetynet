package com.safetynet.alert.model;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Data
@Entity
public class MedicalRecord {
  private String firstName;
  private String lastName;
  private String birthdate;
  @Embedded
  private String[] medications;
  @Embedded
  private String[] allergies;

  private Person person;

}
