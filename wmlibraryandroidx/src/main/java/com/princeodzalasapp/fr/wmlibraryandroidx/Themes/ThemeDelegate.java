package com.princeodzalasapp.fr.wmlibraryandroidx.Themes;

import android.content.Context;
import android.support.annotation.StyleRes;
import android.util.Log;

import com.princeodzalasapp.fr.wmlibraryandroidx.R;

public class ThemeDelegate {
    private ThemeColor.ThemeColors primaryColor;
    private ThemeColor.ThemeColors accentColor;
    private boolean translucent;
    private boolean dark;

    @StyleRes private int styleResPrimary;
    @StyleRes private int styleResAccent;
    @StyleRes private int styleResBase;
    @StyleRes private int customTheme;

    ThemeDelegate(Context context, ThemeColor.ThemeColors primary, ThemeColor.ThemeColors accent, boolean translucent, boolean dark) {

        this.primaryColor=primary;
        this.accentColor=accent;
        this.translucent=translucent;
        this.dark=dark;

        styleResPrimary = context.getResources().getIdentifier("primary" + primary.ordinal(), "style", context.getPackageName());
        styleResAccent = context.getResources().getIdentifier("accent" + accent.ordinal(), "style", context.getPackageName());

        styleResBase = dark ? R.style.ThemeOPL_Dark : R.style.ThemeOPL_Light;
    }

    @StyleRes public int getStyleResPrimary() {
        return styleResPrimary;
    }

    @StyleRes public int getStyleResAccent() {
        return styleResAccent;
    }

    @StyleRes public int getStyleResBase() {
        return styleResBase;
    }

    public ThemeColor.ThemeColors getPrimaryColor() {
        return primaryColor;
    }

    public ThemeColor.ThemeColors getAccentColor() {
        return accentColor;
    }

    public boolean isTranslucent() {
        return translucent;
    }

    public boolean isDark() {
        return dark;
    }
}
