package com.example.android.tourguide;

/**
 * This is a Location class. Objects created from this class will have image, name and description.
 */
public class Location {
    private String mName;
    private String mDescription;
    private int mImageResourceId;

    //constructor
    public Location(String name, String description, int image) {
        mName = name;
        mDescription = description;
        mImageResourceId = image;
    }
    //getters and setters

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
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
