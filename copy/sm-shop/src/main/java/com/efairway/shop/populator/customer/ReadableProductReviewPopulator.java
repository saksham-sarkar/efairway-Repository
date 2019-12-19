package com.efairway.shop.populator.customer;

import com.efairway.shop.model.customer.ReadableCustomerReview;
import com.salesmanager.core.business.exception.ConversionException;
import com.salesmanager.core.business.utils.AbstractDataPopulator;
import com.salesmanager.core.model.customer.review.CustomerReview;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;

public class ReadableProductReviewPopulator extends AbstractDataPopulator<CustomerReview, ReadableCustomerReview> {

	@Override
	public ReadableCustomerReview populate(CustomerReview source, ReadableCustomerReview target, MerchantStore store,
			Language language) throws ConversionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ReadableCustomerReview createTarget() {
		// TODO Auto-generated method stub
		return null;
	}

}
