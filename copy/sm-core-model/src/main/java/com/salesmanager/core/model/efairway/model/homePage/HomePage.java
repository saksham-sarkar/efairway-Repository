package com.salesmanager.core.model.efairway.model.homePage;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.generic.SalesManagerEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(value = com.salesmanager.core.model.common.audit.AuditListener.class)
@Table(name = "HOME_PAGE", schema= SchemaConstant.SALESMANAGER_SCHEMA)
public class HomePage extends SalesManagerEntity<Long, HomePage> implements Auditable {


    private static final long serialVersionUID = -8026866073020149935L;

    @Id
    @Column(name = "SECTION_ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sectionId;

    @Embedded
    private AuditSection auditSection = new AuditSection();

    @Column(name = "SECTION_TYPE")
    private String sectionType;

    @Column(name = "SECTION_LABEL")
    private String sectionLabel;


    @Column(name="VIEW_MORE_LABEL")
    private String viewMoreLabel;

    @Column(name ="VIEW_MORE_LINK")
    private String viewMoreLink;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "homePage")
    private List<HomePageImages> homePageImages = new ArrayList<>();

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    public String getSectionLabel() {
        return sectionLabel;
    }

    public void setSectionLabel(String sectionLabel) {
        this.sectionLabel = sectionLabel;
    }

    public String getViewMoreLabel() { return viewMoreLabel; }

    public void setViewMoreLabel(String viewMoreLabel) { this.viewMoreLabel = viewMoreLabel; }

    public String getViewMoreLink() {
        return viewMoreLink;
    }

    public void setViewMoreLink(String viewMoreLink) {
        this.viewMoreLink = viewMoreLink;
    }

    public List<HomePageImages> getHomePageImages() {
        return homePageImages;
    }

    public void setHomePageImages(List<HomePageImages> homePageImages) {
        this.homePageImages = homePageImages;
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

