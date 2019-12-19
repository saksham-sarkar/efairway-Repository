package com.salesmanager.core.business.services.efairway.footer;


import com.salesmanager.core.business.repositories.efairway.footer.FooterRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.model.efairway.model.footer.Footer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("footerService")
public class FooterServiceImpl extends SalesManagerEntityServiceImpl<Long, Footer> implements FooterService{


    private FooterRepository footerRepository;

    public FooterServiceImpl(FooterRepository repository) {
        super(repository);
        this.footerRepository = repository;
    }

    @Override
    public Footer getFooter(Long id) {
        Footer footer = footerRepository.findOne(id);
        return footer;
    }
}

