package com.tatar.interactivestory.model;

/**
 * Created by emuoztu on 6/22/2017.
 */

public class Choice {

    private int textId;
    private int nextPage;

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
