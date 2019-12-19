package com.efairway.shop.mapper.optin;

import com.efairway.shop.mapper.Mapper;
import com.efairway.shop.model.system.PersistableOptin;
import org.springframework.stereotype.Component;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.system.optin.Optin;
import com.salesmanager.core.model.system.optin.OptinType;

@Component
public class PersistableOptinMapper implements Mapper<PersistableOptin, Optin> {


  @Override
  public Optin convert(PersistableOptin source, MerchantStore store, Language language) {
    Optin optinEntity = new Optin();
    optinEntity.setCode(source.getCode());
    optinEntity.setDescription(source.getDescription());
    optinEntity.setOptinType(OptinType.valueOf(source.getOptinType()));
    optinEntity.setMerchant(store);
    return optinEntity;
  }
}
