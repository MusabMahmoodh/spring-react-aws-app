package com.awsimage.awsimage.buckets;

public enum BucketName {

    PROFILE_IMAGE("springapp-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
