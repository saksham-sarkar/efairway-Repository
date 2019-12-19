package com.efairway.shop.model.marketplace;

import com.efairway.shop.model.shop.ReadableMerchantStore;

public class ReadableMarketPlace extends MarketPlaceEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ReadableMerchantStore store;

	public ReadableMerchantStore getStore() {
		return store;
	}

	public void setStore(ReadableMerchantStore store) {
		this.store = store;
	}

}
