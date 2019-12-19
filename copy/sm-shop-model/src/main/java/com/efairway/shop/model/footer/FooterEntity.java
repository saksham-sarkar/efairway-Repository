package com.efairway.shop.model.footer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"id","newsLetterLabel","newsLetterDescription","searchLabel","aboutFairwayLabel","readableAboutSections","callUsLabel","callUsLink","emailUsLabel","emailUsLink","copyrightDescription"})
public class FooterEntity implements Serializable {

    private static final long serialVersionUID = 3315699857507937281L;

    @JsonProperty("id")
    private Long id;
    @JsonProperty("newsLetterLabel")
    private String newsLetterLabel;
    @JsonProperty("newsLetterDescription")
    private String newsLetterDescription;
    @JsonProperty("searchLabel")
    private String searchLabel;
    @JsonProperty("aboutFairwayLabel")
    private String aboutFairwayLabel;
    @JsonProperty("readableAboutSections")
    private List<AboutSectionEntity> aboutSectionEntityList;
    @JsonProperty("callUsLabel")
    private String callUsLabel;
    @JsonProperty("callUsLink")
    private String callUsLink;
    @JsonProperty("emailUsLabel")
    private String emailUsLabel;
    @JsonProperty("emailUsLink")
    private String emailUsLink;
    @JsonProperty("copyrightDescription")
    private String copyrightDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<AboutSectionEntity> getAboutSectionEntityList() {
        return aboutSectionEntityList;
    }

    public void setAboutSectionEntityList(List<AboutSectionEntity> aboutSectionEntityList) {
        this.aboutSectionEntityList = aboutSectionEntityList;
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
}

