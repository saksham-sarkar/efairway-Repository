package com.salesmanager.core.model.efairway.model.header;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "HEADER", schema = SchemaConstant.SALESMANAGER_SCHEMA)
public class Header extends SalesManagerEntity<Integer, Header> implements Auditable {

    private static final long serialVersionUID = -4191711328507858666L;

    @Id
    @Column(name = "HEADER_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private AuditSection auditSection = new AuditSection();


    @NotEmpty
    @Column(name = "HEADER_LOGO", nullable = false, length = 100)
    private String logo;

    @NotEmpty
    @Column(name = "HEADER_SEARCH_LABEL", nullable = false, length = 100)
    private String searchLabel;

    @NotEmpty
    @Column(name = "HEADER_CONTACT_US_LABEL", nullable = false, length = 100)
    private String contactUsLabel;

    @NotEmpty
    @Column(name = "HEADER_CONTACT_US_LINK", nullable = false, length = 100)
    private String contactUsLink;

    @NotEmpty
    @Column(name = "HEADER_CALL_US_LABEL", nullable = false, length = 100)
    private String callUsLabel;

    @NotEmpty
    @Column(name = "HEADER_CALL_US_LINK", nullable = false, length = 100)
    private String callUsLink;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSearchLabel() {
        return searchLabel;
    }

    public void setSearchLabel(String searchLabel) {
        this.searchLabel = searchLabel;
    }

    public String getContactUsLabel() {
        return contactUsLabel;
    }

    public void setContactUsLabel(String contactUsLabel) {
        this.contactUsLabel = contactUsLabel;
    }

    public String getContactUsLink() {
        return contactUsLink;
    }

    public void setContactUsLink(String contactUsLink) {
        this.contactUsLink = contactUsLink;
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

    public Header() {
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
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

}
