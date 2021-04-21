package com.safetynet.alert.service;

import com.safetynet.alert.model.Person;
import com.safetynet.alert.repository.AlertProxy;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class AlertService {

  @Autowired
  private AlertProxy alertProxy;

  public Iterable<Person> getPersons() {
    return alertProxy.getPerson();
  }

}
