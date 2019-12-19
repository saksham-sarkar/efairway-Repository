package com.salesmanager.core.business.services.efairway.footer;

import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.efairway.model.aboutSection.AboutSection;

import java.util.List;

public interface AboutSectionService extends SalesManagerEntityService<Long,AboutSection> {

    List<AboutSection> getAllSections();
    List<AboutSection> getByFooterId(Long id);
}

