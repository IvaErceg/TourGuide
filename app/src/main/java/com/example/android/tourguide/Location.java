package com.example.android.tourguide;

public class Location {
    private String mName;
    private String mDescription;
    private int mImageResourceId;

    public Location(String name, String description, int image) {
        mName = name;
        mDescription = description;
        mImageResourceId = image;
    }

    public String getName() {
        return mName;
    }


    public String getDescription() {
        return mDescription;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }


    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
