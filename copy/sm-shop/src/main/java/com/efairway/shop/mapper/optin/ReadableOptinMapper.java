package com.efairway.shop.mapper.optin;

import com.efairway.shop.mapper.Mapper;
import com.efairway.shop.model.system.ReadableOptin;
import org.springframework.stereotype.Component;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.system.optin.Optin;

@Component
public class ReadableOptinMapper implements Mapper<Optin, ReadableOptin> {


  @Override
  public ReadableOptin convert(Optin source, MerchantStore store, Language language) {
    ReadableOptin optinEntity = new ReadableOptin();
    optinEntity.setCode(source.getCode());
    optinEntity.setDescription(source.getDescription());
    optinEntity.setOptinType(source.getOptinType().name());
    return optinEntity;
  }
}
