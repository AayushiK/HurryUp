package com.example.hurryup.app;

/**
 * Created by aayushi on 3/29/14.
 */
public class DataObject {

    public static enum DataObjectType { PHOTO, NOTE, MAP }

    public final String text;
    public final DataObjectType type;

    public DataObject(String text, DataObjectType type) {
        this.text = text;
        this.type = type;
    }
}
