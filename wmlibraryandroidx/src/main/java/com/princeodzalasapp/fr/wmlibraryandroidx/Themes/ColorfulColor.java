package com.princeodzalasapp.fr.wmlibraryandroidx.Themes;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorRes;

public class ColorfulColor {

    private String hexColor;

    public ColorfulColor(String hexColor) {
        this.hexColor = hexColor;
    }

    public ColorfulColor(Context ctx, int colorRes) {
        this("#${Integer.toHexString(ContextCompat.getColor(context, colorRes))}");
    }

    public int asInt(){
        return Color.parseColor(hexColor);
    }
    public String asHex(){
        return this.hexColor;
    }
}
