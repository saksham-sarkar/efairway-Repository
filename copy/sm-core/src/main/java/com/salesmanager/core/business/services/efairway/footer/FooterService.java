package com.salesmanager.core.business.services.efairway.footer;

import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.efairway.model.footer.Footer;


import java.util.List;

public interface FooterService extends SalesManagerEntityService<Long, Footer> {

     Footer getFooter(Long id);
}
