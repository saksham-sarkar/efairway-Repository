package com.salesmanager.core.business.services.efairway.homePage;

import com.salesmanager.core.business.repositories.efairway.homePage.HomePageRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.model.efairway.model.homePage.HomePage;
import com.salesmanager.core.model.efairway.model.homePage.HomePageImages;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("homePageService")
public class HomePageServiceImpl extends SalesManagerEntityServiceImpl<Long, HomePage> implements HomePageService{

    private HomePageRepository homePageRepository;

    public HomePageServiceImpl(HomePageRepository repository) {
        super(repository);
        this.homePageRepository = repository;
    }

    @Override
    public List<HomePage> getAllSections() {
        List<HomePage> homePageSectionList = homePageRepository.findAll();
        return homePageSectionList;
    }

}

