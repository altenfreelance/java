package com.altenfreelance;

public class TextBox extends UIControl{
    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    public void render(){
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void clear() {
        text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

}
