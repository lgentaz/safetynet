package com.safetynet.alert;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix="com.safety.alert")
public class ConfigProperties {
  private String jsonFile;
}
