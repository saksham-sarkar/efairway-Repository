package com.salesmanager.core.business.services.efairway.homePage;

import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.efairway.model.homePage.HomePage;

import java.util.List;

public interface HomePageService extends SalesManagerEntityService<Long, HomePage> {

    List<HomePage> getAllSections();
}

