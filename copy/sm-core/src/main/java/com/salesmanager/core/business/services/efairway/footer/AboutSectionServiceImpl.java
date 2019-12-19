package com.salesmanager.core.business.services.efairway.footer;

import com.salesmanager.core.business.repositories.efairway.footer.AboutSectionRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.model.efairway.model.aboutSection.AboutSection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("aboutSectionService")
public class AboutSectionServiceImpl extends SalesManagerEntityServiceImpl<Long, AboutSection> implements AboutSectionService {

    private AboutSectionRepository aboutSectionRepository;

    public AboutSectionServiceImpl(AboutSectionRepository repository) {
        super(repository);
        this.aboutSectionRepository = repository;

    }

    @Override
    public List<AboutSection> getAllSections() {
        List<AboutSection> aboutSectionList = aboutSectionRepository.findAll();
        return aboutSectionList;
    }

    @Override
    public List<AboutSection> getByFooterId(Long id) {
        List<AboutSection> aboutSections = aboutSectionRepository.findByFooterId(id);
        return aboutSections;
    }
}

