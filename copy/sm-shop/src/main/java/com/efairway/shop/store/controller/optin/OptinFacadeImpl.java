package com.efairway.shop.store.controller.optin;

import com.efairway.shop.model.system.PersistableOptin;
import com.efairway.shop.model.system.ReadableOptin;
import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.system.optin.OptinService;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.system.optin.Optin;
import com.efairway.shop.mapper.optin.PersistableOptinMapper;
import com.efairway.shop.mapper.optin.ReadableOptinMapper;
import com.efairway.shop.store.api.exception.ServiceRuntimeException;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class OptinFacadeImpl implements OptinFacade {

  @Inject
  private OptinService optinService;

  @Inject
  private ReadableOptinMapper readableOptinConverter;
  @Inject
  private PersistableOptinMapper persistableOptinConverter;

  @Override
  public ReadableOptin create(
          PersistableOptin persistableOptin, MerchantStore merchantStore, Language language) {
    Optin optinEntity = persistableOptinConverter.convert(persistableOptin, merchantStore, language);
    Optin savedOptinEntity = createOptin(optinEntity);
    return readableOptinConverter.convert(savedOptinEntity, merchantStore, language);
  }

  private Optin createOptin(Optin optinEntity) {
    try{
      optinService.create(optinEntity);
      return optinEntity;
    } catch (ServiceException e){
      throw new ServiceRuntimeException(e);
    }

  }
}
