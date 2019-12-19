package com.efairway.shop.model.shop;

import com.efairway.shop.model.content.ReadableImage;

public class ReadableBrand extends MerchantStoreBrand {
  
  private ReadableImage logo;

  public ReadableImage getLogo() {
    return logo;
  }

  public void setLogo(ReadableImage logo) {
    this.logo = logo;
  }

}
