package com.efairway.shop.store.controller.efairway.footer.facade;

import com.efairway.shop.model.footer.AboutSectionEntity;
import com.efairway.shop.model.footer.FooterEntity;
import com.salesmanager.core.business.services.efairway.footer.AboutSectionService;
import com.salesmanager.core.business.services.efairway.footer.FooterService;
import com.salesmanager.core.model.efairway.model.aboutSection.AboutSection;
import com.salesmanager.core.model.efairway.model.footer.Footer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("footerFacade")
public class FooterFacadeImpl implements FooterFacade {

    @Autowired
    FooterService footerService;

    @Autowired
    AboutSectionService aboutSectionService;

    @Override
    public FooterEntity getReadableFooter(Long id) {
        Footer footer = footerService.getFooter(id);


        List<AboutSection> aboutSectionList = aboutSectionService.getByFooterId(id);

        List<AboutSectionEntity> aboutSectionEntities = new ArrayList<>();
        for(AboutSection aboutSection : aboutSectionList){
            AboutSectionEntity aboutSectionEntity = new AboutSectionEntity();
            aboutSectionEntity.setLabel1(aboutSection.getLabel1());
            aboutSectionEntity.setLabel1Link(aboutSection.getLabel1Link());
            aboutSectionEntity.setLabel2(aboutSection.getLabel2());
            aboutSectionEntity.setLabel2Link(aboutSection.getLabel2Link());
            aboutSectionEntity.setLabel3(aboutSection.getLabel3());
            aboutSectionEntity.setLabel3Link(aboutSection.getLabel3Link());
            aboutSectionEntity.setLabel4(aboutSection.getLabel4());
            aboutSectionEntity.setLabel4Link(aboutSection.getLabel4Link());
            aboutSectionEntities.add(aboutSectionEntity);
        }

        FooterEntity footerEntity = new FooterEntity();
            footerEntity.setId(footer.getId());
            footerEntity.setNewsLetterLabel(footer.getNewsLetterLabel());
            footerEntity.setNewsLetterDescription(footer.getNewsLetterDescription());
            footerEntity.setSearchLabel(footer.getSearchLabel());
            footerEntity.setAboutFairwayLabel(footer.getAboutFairwayLabel());
            footerEntity.setCallUsLabel(footer.getCallUsLabel());
            footerEntity.setCallUsLink(footer.getCallUsLink());
            footerEntity.setEmailUsLabel(footer.getEmailUsLabel());
            footerEntity.setEmailUsLink(footer.getEmailUsLink());
            footerEntity.setCopyrightDescription(footer.getCopyrightDescription());
            footerEntity.setAboutSectionEntityList(aboutSectionEntities);



        return footerEntity;
    }
}

