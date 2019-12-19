package com.efairway.shop.model.header;

public class TopLinks {
    private TopLinkSection contactUs;
    private TopLinkSection callUs;

    public TopLinkSection getContactUs() {
        return contactUs;
    }

    public void setContactUs(TopLinkSection contactUs) {
        this.contactUs = contactUs;
    }

    public TopLinkSection getCallUs() {
        return callUs;
    }

    public void setCallUs(TopLinkSection callUs) {
        this.callUs = callUs;
    }

    public TopLinks(TopLinkSection contactUs, TopLinkSection callUs) {
        this.contactUs = contactUs;
        this.callUs = callUs;
    }

    public TopLinks() {
    }
}
