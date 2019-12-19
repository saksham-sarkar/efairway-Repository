package com.efairway.shop.store.controller.system;

import com.efairway.shop.model.system.Configs;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;

public interface MerchantConfigurationFacade {

  Configs getMerchantConfig(MerchantStore merchantStore, Language language);

}
