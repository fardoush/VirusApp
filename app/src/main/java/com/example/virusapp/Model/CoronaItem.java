package com.example.virusapp.Model;

public class CoronaItem {

    private String cText,csubtext;
    private boolean isExpandable;

    public CoronaItem(String cText, String csubtext, boolean isExpandable) {
        this.cText = cText;
        this.csubtext = csubtext;
        this.isExpandable = isExpandable;
    }

    public String getcText() {
        return cText;
    }

    public void setcText(String cText) {
        this.cText = cText;
    }

    public String getCsubtext() {
        return csubtext;
    }

    public void setCsubtext(String csubtext) {
        this.csubtext = csubtext;
    }

    public boolean isExpandable() {
        return isExpandable;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }
}
