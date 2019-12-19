package com.efairway.shop.store.controller.efairway.header.facade;

import com.efairway.shop.model.header.ReadableHeader;

public interface HeaderFacade {

     ReadableHeader getHeaderDetails(Integer id);
     ReadableHeader updateHeaderDetails(Integer id, ReadableHeader readableHeader);

}
