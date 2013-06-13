package com.tobiasschuerg.adyk;

/**
 * Created by Tobias Schürg on 13.06.13.
 */
public class ToolTip {

    private final int mId;
    private final String mMessage;

    public ToolTip(int id, String message) {
        this.mId = id;
        this.mMessage = message;

    }

    public String getMessage() {
        return mMessage;
    }

    public int getId() {
        return mId;
    }
}
