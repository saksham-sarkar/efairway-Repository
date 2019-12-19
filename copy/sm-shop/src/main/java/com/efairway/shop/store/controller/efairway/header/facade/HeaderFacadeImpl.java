package com.efairway.shop.store.controller.efairway.header.facade;

import com.efairway.shop.model.header.ReadableHeader;
import com.efairway.shop.model.header.TopLinks;
import com.efairway.shop.store.api.exception.ServiceRuntimeException;
import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.efairway.header.HeaderService;
import com.salesmanager.core.model.efairway.model.header.Header;
import com.efairway.shop.model.header.TopLinkSection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("headerFacade")
public class HeaderFacadeImpl implements HeaderFacade {

    @Autowired
    private HeaderService headerService;

    private static final Logger LOGGER = LoggerFactory.getLogger(HeaderFacadeImpl.class);
    @Override
    public ReadableHeader getHeaderDetails(Integer id) {
        ReadableHeader readableHeader = null;
        try {
            Header header = headerService.getHeaderDetails(id);
            if (header == null) {
                throw new ServiceRuntimeException("Fairway-Error 500","Header doesn't exist for this id");
            }
            readableHeader = getHeader(header, new ReadableHeader());
         }
            catch (ServiceException e) {
                LOGGER.error(e.getMessageCode());
                throw new ServiceRuntimeException("Fairway-Error 500", e.getMessageCode());
            }
        return readableHeader;
    }

    private ReadableHeader getHeader(Header header, ReadableHeader readableHeader){
        readableHeader.setLogo(header.getLogo());
        readableHeader.setSearchLabel(header.getSearchLabel());
        TopLinkSection contactUs = new TopLinkSection(header.getContactUsLabel(), header.getContactUsLink());
        TopLinkSection callUs = new TopLinkSection(header.getCallUsLabel(), header.getCallUsLink());
        TopLinks topLinks = new TopLinks(contactUs, callUs);

        readableHeader.setTopLinks(topLinks);
        return readableHeader;
    }

    @Override
    public ReadableHeader updateHeaderDetails(Integer id, ReadableHeader readableHeader) {
        ReadableHeader headerResponse = null;
        try {
            Header header = headerService.getHeaderDetails(id);
            if (header == null) {
                throw new ServiceRuntimeException("Fairway-Error 500","Header doesn't exist for this id. Cannot Update");
            }
            String callUs = readableHeader.getTopLinks().getCallUs().getLabel();
            if(!callUs.matches("[0-9]+")){
                throw new ServiceRuntimeException("Fairway-Error 400","Call Us label should be numeric");
            }
            if(callUs.length()!=11){
                throw new ServiceRuntimeException("Fairway-Error 400","Call Us label must have 11 digits");
            }
            String callUsNumber = callUs.replaceFirst("(\\d{3})(\\d{4})(\\d{4})","+$1 $2 $3");
            Header headerEntity = new Header();
            headerEntity.setId(id);
            headerEntity.setLogo(readableHeader.getLogo());
            headerEntity.setSearchLabel(readableHeader.getSearchLabel());
            headerEntity.setContactUsLink(readableHeader.getTopLinks().getContactUs().getLink());
            headerEntity.setContactUsLabel(readableHeader.getTopLinks().getContactUs().getLabel());
            headerEntity.setCallUsLabel(callUsNumber);
            headerEntity.setCallUsLink(readableHeader.getTopLinks().getCallUs().getLink());

            headerService.update(headerEntity);
            header = headerService.getHeaderDetails(id);
            headerResponse = getHeader(header, new ReadableHeader());
        } catch (ServiceException e) {
            LOGGER.error(e.getMessageCode());
            throw new ServiceRuntimeException("Fairway-Error 500", e.getMessageCode());
        }
        return headerResponse;
    }
}
