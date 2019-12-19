package com.efairway.shop.application.config;

import com.efairway.shop.utils.ImageFilePath;
import com.efairway.shop.utils.LocalImageFilePathUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Profile({"default","docker","gcp","firebase"})
public class LocalLocationImageConfig {

  @Bean
  public ImageFilePath img() {
    LocalImageFilePathUtils localImageFilePathUtils = new LocalImageFilePathUtils();
    localImageFilePathUtils.setBasePath("/images");
//    localImageFilePathUtils.setBasePath("/static");
    return localImageFilePathUtils;
  }
}
