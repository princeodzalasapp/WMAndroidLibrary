package com.princeodzalasapp.fr.wmlibraryandroidx.Themes;

import android.app.Activity;

public class Themes {

    public static void set(int primaryColor, int accentColor,
                                boolean translucent, boolean dark, Activity act) {
        ThemeColor.applyTheme(act);
        ThemeColor.config(act)
                .primaryColor(getThemeColor(primaryColor))
                .accentColor(getThemeColor(accentColor))
                .translucent(translucent)
                .dark(dark)
                .apply();
    }


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

    public static ThemeColor.ThemeColors getThemeColor(int val){
        switch(val){
            case 1 : return ThemeColor.ThemeColors.RED;
            case 2 : return ThemeColor.ThemeColors.PINK;
            case 3 : return ThemeColor.ThemeColors.PURPLE;
            case 4 : return ThemeColor.ThemeColors.DEEP_PURPLE;
            case 5 : return ThemeColor.ThemeColors.INDIGO;
            case 6 : return ThemeColor.ThemeColors.BLUE;
            case 7 : return ThemeColor.ThemeColors.LIGHT_BLUE;
            case 8 : return ThemeColor.ThemeColors.CYAN;
            case 9 : return ThemeColor.ThemeColors.TEAL;
            case 10 : return ThemeColor.ThemeColors.GREEN;
            case 11 : return ThemeColor.ThemeColors.LIGHT_GREEN;
            case 12 : return ThemeColor.ThemeColors.LIME;
            case 13 : return ThemeColor.ThemeColors.YELLOW;
            case 14 : return ThemeColor.ThemeColors.AMBER;
            case 15 : return ThemeColor.ThemeColors.ORANGE;
            case 16 : return ThemeColor.ThemeColors.DEEP_ORANGE;
            case 17 : return ThemeColor.ThemeColors.BROWN;
            case 18 : return ThemeColor.ThemeColors.GREY;
            case 19 : return ThemeColor.ThemeColors.BLUE_GREY;
            case 20 : return ThemeColor.ThemeColors.WHITE;
            case 21 : return ThemeColor.ThemeColors.BLACK;
            default: return ThemeColor.ThemeColors.RED;
        }
    }

}