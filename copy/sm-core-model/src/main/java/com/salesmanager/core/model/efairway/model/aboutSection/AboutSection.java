package com.salesmanager.core.model.efairway.model.aboutSection;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.efairway.model.footer.Footer;
import com.salesmanager.core.model.generic.SalesManagerEntity;

import javax.persistence.*;

@Entity
@EntityListeners(value = com.salesmanager.core.model.common.audit.AuditListener.class)
@Table(name = "ABOUT_SECTION", schema= SchemaConstant.SALESMANAGER_SCHEMA)
public class AboutSection extends SalesManagerEntity<Long,AboutSection> implements Auditable {


    @Id
    @Column(name = "SECTION_ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private AuditSection auditSection = new AuditSection();


    @Column(name="LABEL_1")
    private String label1;

    @Column(name = "LABEL1_LINK")
    private String label1Link;

    @Column(name = "LABEL_2")
    private String label2;

    @Column(name = "LABEL2_LINK")
    private String label2Link;

    @Column(name="LABEL_3")
    private String label3;

    @Column(name="LABEL3_LINK")
    private String label3Link;

    @Column(name = "LABEL_4")
    private String label4;

    @Column(name="LABEL4_LINK")
    private String label4Link;

    @ManyToOne(targetEntity = Footer.class)
    @JoinColumn(name="FOOTER_ID", nullable=false)
    private Footer footer;


    public AboutSection(){ }

    public AboutSection(Footer footer1){
        this.footer = footer1;
        this.id = 0L;
    }
    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel1Link() {
        return label1Link;
    }

    public void setLabel1Link(String label1Link) {
        this.label1Link = label1Link;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getLabel2Link() {
        return label2Link;
    }

    public void setLabel2Link(String label2Link) {
        this.label2Link = label2Link;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }

    public String getLabel3Link() {
        return label3Link;
    }

    public void setLabel3Link(String label3Link) {
        this.label3Link = label3Link;
    }

    public String getLabel4() {
        return label4;
    }

    public void setLabel4(String label4) {
        this.label4 = label4;
    }

    public String getLabel4Link() {
        return label4Link;
    }

    public void setLabel4Link(String label4Link) {
        this.label4Link = label4Link;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    @Override
    public AuditSection getAuditSection() {
        return this.auditSection;
    }

    @Override
    public void setAuditSection(AuditSection auditSection) {
        this.auditSection =auditSection;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}

