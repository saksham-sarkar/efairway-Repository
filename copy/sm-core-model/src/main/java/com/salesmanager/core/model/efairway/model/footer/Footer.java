package com.salesmanager.core.model.efairway.model.footer;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.efairway.model.aboutSection.AboutSection;
import com.salesmanager.core.model.generic.SalesManagerEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@EntityListeners(value = com.salesmanager.core.model.common.audit.AuditListener.class)
@Table(name = "FOOTER", schema= SchemaConstant.SALESMANAGER_SCHEMA)
public class Footer extends SalesManagerEntity<Long,Footer> implements Auditable {


    private static final long serialVersionUID = -8026866073020149935L;


    @Id
    @Column(name = "FOOTER_ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private AuditSection auditSection = new AuditSection();

    @Column(name ="NEWS_LETTER_LABEL")
    private String newsLetterLabel;

    @Column(name = "NEWS_LETTER_DESCRIPTION")
    private String newsLetterDescription;

    @Column(name ="SEARCH_LABEL")
    private String searchLabel;

    @Column(name="ABOUT_LABEL")
    private String aboutFairwayLabel;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "footer")
    private List<AboutSection> aboutSectionList = new ArrayList<>();

    @Column(name="CALL_US_LABEL")
    private String callUsLabel;

    @Column(name="CALL_US_LINK")
    private String callUsLink;

    @Column(name="EMAIL_US_LABEL")
    private String emailUsLabel;

    @Column(name="EMAIL_US_LINK")
    private String emailUsLink;

    @Column(name = "COPYRIGHT")
    private String copyrightDescription;

    public Footer(){  }

    public String getNewsLetterLabel() {
        return newsLetterLabel;
    }

    public void setNewsLetterLabel(String newsLetterLabel) {
        this.newsLetterLabel = newsLetterLabel;
    }

    public String getNewsLetterDescription() {
        return newsLetterDescription;
    }

    public void setNewsLetterDescription(String newsLetterDescription) {
        this.newsLetterDescription = newsLetterDescription;
    }

    public String getSearchLabel() {
        return searchLabel;
    }

    public void setSearchLabel(String searchLabel) {
        this.searchLabel = searchLabel;
    }

    public String getAboutFairwayLabel() {
        return aboutFairwayLabel;
    }

    public void setAboutFairwayLabel(String aboutFairwayLabel) {
        this.aboutFairwayLabel = aboutFairwayLabel;
    }

    public String getCallUsLabel() {
        return callUsLabel;
    }

    public void setCallUsLabel(String callUsLabel) {
        this.callUsLabel = callUsLabel;
    }

    public String getCallUsLink() {
        return callUsLink;
    }

    public void setCallUsLink(String callUsLink) {
        this.callUsLink = callUsLink;
    }

    public String getEmailUsLabel() {
        return emailUsLabel;
    }

    public void setEmailUsLabel(String emailUsLabel) {
        this.emailUsLabel = emailUsLabel;
    }

    public String getEmailUsLink() {
        return emailUsLink;
    }

    public void setEmailUsLink(String emailUsLink) {
        this.emailUsLink = emailUsLink;
    }

    public String getCopyrightDescription() {
        return copyrightDescription;
    }

    public void setCopyrightDescription(String copyrightDescription) {
        this.copyrightDescription = copyrightDescription;
    }

    public List<AboutSection> getAboutSectionList() {
        return aboutSectionList;
    }

    public void setAboutSectionList(List<AboutSection> aboutSectionList) {
        this.aboutSectionList = aboutSectionList;
    }

    @Override
    public AuditSection getAuditSection() {
        return this.auditSection;
    }

    @Override
    public void setAuditSection(AuditSection audit) {
        this.auditSection = audit;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }
}

