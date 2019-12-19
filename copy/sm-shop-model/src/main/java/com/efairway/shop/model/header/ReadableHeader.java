package com.efairway.shop.model.header;

public class ReadableHeader {
    private String logo;
    private String searchLabel;
    private TopLinks topLinks;

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

    public TopLinks getTopLinks() {
        return topLinks;
    }

    public void setTopLinks(TopLinks topLinks) {
        this.topLinks = topLinks;
    }

    public ReadableHeader(String logo, String searchLabel, TopLinks topLinks) {
        this.logo = logo;
        this.searchLabel = searchLabel;
        this.topLinks = topLinks;
    }

    public ReadableHeader() {
    }
}
