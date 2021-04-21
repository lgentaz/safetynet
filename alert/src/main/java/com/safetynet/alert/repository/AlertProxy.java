package com.safetynet.alert.repository;

import com.safetynet.alert.ConfigProperties;
import com.safetynet.alert.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class AlertProxy {

  @Autowired
  private ConfigProperties props;

  public Iterable<Person> getPerson(){
    String baseJsonFile = props.getJsonFile();

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<Iterable<Person>> response = restTemplate.exchange(baseJsonFile,
        HttpMethod.GET,
        null,
        new ParameterizedTypeReference<Iterable<Person>>(){});
    log.debug("Get DB call " + response.getStatusCode().toString());
    return response.getBody();
  }
}
