package com.salesmanager.core.model.efairway.model.homePage;


import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.generic.SalesManagerEntity;

import javax.persistence.*;

@Entity
@EntityListeners(value = com.salesmanager.core.model.common.audit.AuditListener.class)
@Table(name = "HOME_PAGE_IMAGES", schema= SchemaConstant.SALESMANAGER_SCHEMA)
public class HomePageImages extends SalesManagerEntity<Long, HomePageImages> implements Auditable {



    @Id
    @Column(name = "IMAGE_ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @Column(name = "IMAGE_LABEL")
    private String imageLink;

    @ManyToOne(targetEntity = HomePage.class)
    @JoinColumn(name="SECTION_ID", nullable=false)
    private HomePage homePage;

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    @Override
    public AuditSection getAuditSection() {
        return null;
    }

    @Override
    public void setAuditSection(AuditSection audit) {

    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }
}

