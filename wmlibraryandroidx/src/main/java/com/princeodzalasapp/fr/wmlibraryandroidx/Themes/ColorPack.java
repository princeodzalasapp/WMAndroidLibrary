package com.princeodzalasapp.fr.wmlibraryandroidx.Themes;

public class ColorPack {
    private ColorfulColor colorNormal;
    private ColorfulColor colorDark;

    public ColorPack(ColorfulColor colorNormal, ColorfulColor colorDark ) {
        this.colorNormal = colorNormal;
        this.colorDark = colorDark;
    }

    public ColorfulColor normal() {
        return colorNormal;
    }
    public ColorfulColor dark() {
        return colorDark;
    }

}
