package com.princeodzalasapp.fr.wmlibraryandroidx.Themes;

import android.app.Activity;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;
import static com.princeodzalasapp.fr.wmlibraryandroidx.Services.Constantes.KEY_PREFS;
import static com.princeodzalasapp.fr.wmlibraryandroidx.Services.Constantes.KEY_THEME;

public class Themes {

    private static SharedPreferences prefs;


    /**
     * Thèmes Full Customisé
     *
     * @param primaryColor
     * @param accentColor
     * @param translucent
     * @param dark
     * @param act
     */
    public static void setColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor,
                                boolean translucent, boolean dark, Activity act) {
        ThemeColor.applyTheme(act);
        ThemeColor.config(act)
                .primaryColor(primaryColor)
                .accentColor(accentColor)
                .translucent(translucent)
                .dark(dark)
                .apply();
    }

    public static void setTestColor(Activity act) {
        ThemeColor.applyTheme(act);
        ThemeColor.config(act)
                .primaryColor(ThemeColor.ThemeColors.BLUE)
                .accentColor(ThemeColor.ThemeColors.AMBER)
                .translucent(false)
                .dark(false)
                .apply();
    }

    /**
     * Thèmes Light
     *
     * @param primaryColor
     * @param accentColor
     * @param translucent
     * @param act
     */
    public static void setLightColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor,
                                     boolean translucent, Activity act) {
        setColor(primaryColor, accentColor, translucent, false, act);
    }

    public static void setLightTransColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor, Activity act) {
        setColor(primaryColor, accentColor, true, false, act);
    }

    public static void setLightNoTransColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor, Activity act) {
        setColor(primaryColor, accentColor, false, false, act);
    }

    /**
     * Thèmes Dark
     *
     * @param primaryColor
     * @param accentColor
     * @param translucent
     * @param act
     */
    public static void setDarkColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor,
                                    boolean translucent, Activity act) {
        setColor(primaryColor, accentColor, translucent, true, act);
    }

    public static void setDarkTransColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor, Activity act) {
        setColor(primaryColor, accentColor, true, true, act);
    }

    public static void setDarkNoTransColor(ThemeColor.ThemeColors primaryColor, ThemeColor.ThemeColors accentColor, Activity act) {
        setColor(primaryColor, accentColor, false, true, act);
    }

    public static void getThemes() {

    }

}