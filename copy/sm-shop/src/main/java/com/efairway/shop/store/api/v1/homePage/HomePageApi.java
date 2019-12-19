package com.efairway.shop.store.api.v1.homePage;


import com.efairway.shop.model.homePage.HomePageEntity;
import com.efairway.shop.store.controller.efairway.homepage.facade.HomePageFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class HomePageApi {

    @Inject
    private HomePageFacade homePageFacade;

    @RequestMapping(value = "/homepage/", method = RequestMethod.GET)
    @ResponseBody
    public List<HomePageEntity> get(HttpServletResponse response) throws Exception {

        List<HomePageEntity> homePageEntities = homePageFacade.getReadableHomePage();


        if (homePageEntities == null) {
            response.sendError(404, "HomePage not fount");
            return null;
        }

        return homePageEntities;
    }

}

