package com.efairway.shop.controller;

public class UploadFileResponse {

    private String fileName;
    private String fileDownloadUri;
    private String contentType;
    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String contentType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.contentType = contentType;
        this.size = size;
    }
}
