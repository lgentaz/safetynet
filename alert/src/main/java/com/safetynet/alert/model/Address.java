package com.safetynet.alert.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Address {
  private String address;
  private String zip;
  private String city;

  private List<Person> persons = new ArrayList<Person>();
  private Firestation firestation;

}
