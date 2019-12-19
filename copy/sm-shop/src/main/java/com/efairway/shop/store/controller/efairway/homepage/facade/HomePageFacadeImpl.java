package com.efairway.shop.store.controller.efairway.homepage.facade;


import com.efairway.shop.model.homePage.HomePageEntity;
import com.efairway.shop.model.homePage.HomePageImagesEntity;
import com.salesmanager.core.business.services.efairway.homePage.HomePageService;
import com.salesmanager.core.model.efairway.model.homePage.HomePage;
import com.salesmanager.core.model.efairway.model.homePage.HomePageImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("homePageFacade")
public class HomePageFacadeImpl implements HomePageFacade {

    @Autowired
    private HomePageService homePageService;

    @Override
    public List<HomePageEntity> getReadableHomePage() {

        List<HomePageEntity> homePageEntities = new ArrayList<>();

        List<HomePage> homePageList = homePageService.getAllSections();

        for(HomePage homePage : homePageList){
            HomePageEntity homePageEntity = new HomePageEntity();
            homePageEntity.setId(homePage.getSectionId());
            homePageEntity.setSectionLabel(homePage.getSectionLabel());
            homePageEntity.setSectionType(homePage.getSectionType());
            homePageEntity.setViewMoreLabel(homePage.getViewMoreLabel());
            homePageEntity.setViewMoreLink(homePage.getViewMoreLink());

            List<HomePageImages> homePageImagesList = homePage.getHomePageImages();
            List<HomePageImagesEntity> homePageImagesEntities = new ArrayList<>();
            for(HomePageImages homePageImages : homePageImagesList){
                HomePageImagesEntity entity = new HomePageImagesEntity();
                entity.setImageId(homePageImages.getImageId());
                entity.setImageUrl(homePageImages.getImageUrl());
                entity.setImageLink(homePageImages.getImageLink());
                homePageImagesEntities.add(entity);
            }
            homePageEntity.setHomePageImagesList(homePageImagesEntities);
            homePageEntities.add(homePageEntity);
        }
        return homePageEntities;
    }
}

