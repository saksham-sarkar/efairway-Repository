package com.salesmanager.core.business.services.efairway.header;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.repositories.efairway.header.HeaderRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.model.efairway.model.header.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("headerService")
public class HeaderServiceImpl extends SalesManagerEntityServiceImpl<Integer, Header>
        implements HeaderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeaderServiceImpl.class);

    @Autowired
    private HeaderRepository headerRepository;

    public HeaderServiceImpl(HeaderRepository repository) {
        super(repository);
        this.headerRepository = repository;
    }

    @Override
    public Header getHeaderDetails(Integer id) throws ServiceException {
        return headerRepository.findOne(id);
    }

}
