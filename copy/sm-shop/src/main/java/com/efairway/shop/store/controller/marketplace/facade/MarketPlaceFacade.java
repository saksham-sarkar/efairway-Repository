package com.efairway.shop.store.controller.marketplace.facade;

import com.efairway.shop.model.system.ReadableOptin;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.system.optin.OptinType;
import com.efairway.shop.model.marketplace.ReadableMarketPlace;

/**
 * Builds market places objects for shop and REST api
 * @author c.samson
 *
 */
public interface MarketPlaceFacade {
	
	
	/**
	 * Get a MarketPlace from store code
	 * @param store
	 * @param lang
	 * @return
	 * @throws Exception
	 */
	ReadableMarketPlace get(String store, Language lang) ;
	
	/**
	 * Finds an optin by merchant and type
	 * @param store
	 * @param type
	 * @return
	 * @throws Exception
	 */
	ReadableOptin findByMerchantAndType(MerchantStore store, OptinType type);

}
