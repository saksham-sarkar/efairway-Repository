package com.efairway.shop.application.config;

import com.efairway.shop.utils.AWSFilePathUtils;
import com.efairway.shop.utils.ImageFilePath;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"aws", "cloud"})
public class AwsLocationImageConfig {


  @Value("${config.cms.contentUrl}")
  private String contentUrl;



  @Bean
  public ImageFilePath img() {
    AWSFilePathUtils awsFilePathUtils = new AWSFilePathUtils();
    awsFilePathUtils.setBasePath(contentUrl);
    return awsFilePathUtils;
  }
}
