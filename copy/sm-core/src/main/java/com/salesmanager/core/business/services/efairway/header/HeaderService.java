package com.salesmanager.core.business.services.efairway.header;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.efairway.model.header.Header;

public interface HeaderService extends SalesManagerEntityService<Integer, Header> {
    Header getHeaderDetails(Integer id)throws ServiceException;
}
