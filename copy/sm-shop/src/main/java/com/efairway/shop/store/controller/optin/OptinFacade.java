package com.efairway.shop.store.controller.optin;

import com.efairway.shop.model.system.PersistableOptin;
import com.efairway.shop.model.system.ReadableOptin;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;

public interface OptinFacade {

  ReadableOptin create(PersistableOptin persistableOptin, MerchantStore merchantStore, Language language);
}
