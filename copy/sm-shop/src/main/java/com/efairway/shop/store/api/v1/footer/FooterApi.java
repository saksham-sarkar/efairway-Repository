package com.efairway.shop.store.api.v1.footer;

import com.efairway.shop.model.footer.FooterEntity;
import com.efairway.shop.store.controller.efairway.footer.facade.FooterFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/api/v1")
public class FooterApi {

    @Inject
    FooterFacade footerFacade;


    @RequestMapping(value = "/footer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public FooterEntity get(@PathVariable("id") Long id, HttpServletResponse response) throws Exception {

        FooterEntity footer = footerFacade.getReadableFooter(id);

        if (footer == null) {
            response.sendError(404, "Footer not fount");
            return null;
        }
        return footer;
    }

   /* @RequestMapping(value = "/footer/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public FooterEntity update(Long id,FooterEntity footerEntity) throws Exception {

        return footerFacade.saveFooter(id,footerEntity);
    } */


}
