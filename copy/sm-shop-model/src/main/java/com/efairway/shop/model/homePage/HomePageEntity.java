package com.efairway.shop.model.homePage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"id","sectionType","sectionLabel","viewMoreLabel","viewMoreLink","homePageImagesList"})
public class HomePageEntity implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("sectionType")
    private String sectionType;

    @JsonProperty("sectionLabel")
    private String sectionLabel;

    @JsonProperty("viewMoreLabel")
    private String viewMoreLabel;

    @JsonProperty("viewMoreLink")
    private String viewMoreLink;

    @JsonProperty("homePageImagesList")
    private List<HomePageImagesEntity> homePageImagesList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getViewMoreLabel() {
        return viewMoreLabel;
    }

    public void setViewMoreLabel(String viewMoreLabel) {
        this.viewMoreLabel = viewMoreLabel;
    }

    public String getViewMoreLink() {
        return viewMoreLink;
    }

    public void setViewMoreLink(String viewMoreLink) {
        this.viewMoreLink = viewMoreLink;
    }

    public List<HomePageImagesEntity> getHomePageImagesList() {
        return homePageImagesList;
    }

    public void setHomePageImagesList(List<HomePageImagesEntity> homePageImagesList) {
        this.homePageImagesList = homePageImagesList;
    }
}

