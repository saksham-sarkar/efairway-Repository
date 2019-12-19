package com.efairway.shop.store.api.v1.header;

import com.efairway.shop.model.header.ReadableHeader;
import com.efairway.shop.store.controller.efairway.header.facade.HeaderFacade;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/header")
public class HeaderApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeaderApi.class);

    @Autowired
    private HeaderFacade headerFacade;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = {"/{id}"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(httpMethod = "GET", value = "Get header details", notes = "",
            response = ReadableHeader.class)
    public ReadableHeader getHeaderDetails(@PathVariable Integer id) {
            return  headerFacade.getHeaderDetails(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = {"/{id}"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(httpMethod = "PUT", value = "Update header details", notes = "",
            response = ReadableHeader.class)
    public ReadableHeader updateHeaderDetails(@PathVariable Integer id, @Valid @RequestBody ReadableHeader readableHeader) {
            return headerFacade.updateHeaderDetails(id, readableHeader);
    }
}
