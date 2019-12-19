package com.efairway.shop.utils;

import com.efairway.shop.store.controller.ControllerConstants;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.efairway.shop.constants.Constants;

public class PageBuilderUtils {
	
	public static String build404(MerchantStore store) {
		return new StringBuilder().append(ControllerConstants.Tiles.Pages.notFound).append(".").append(store.getStoreTemplate()).toString();
	}
	
	public static String buildHomePage(MerchantStore store) {
		return "redirect:" + Constants.SHOP_URI;
	}

}
