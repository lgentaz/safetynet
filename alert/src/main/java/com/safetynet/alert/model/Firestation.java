package com.safetynet.alert.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Firestation {
  private String station;

  private List<Address> addresses = new ArrayList<Address>();

}
