package com.crazyandcoder.top.jetpackdemojava.bean;

public class JetpackItemBean {

    @AJetpack
    private int type;
    private String name;

    public JetpackItemBean(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
