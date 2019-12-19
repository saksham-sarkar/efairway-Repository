package com.efairway.shop.model.header;

public class TopLinkSection {
    private String label;
    private String link;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public TopLinkSection(String label, String link) {
        this.label = label;
        this.link = link;
    }

    public TopLinkSection() {
    }
}
