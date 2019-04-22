package com.princeodzalasapp.fr.wmlibraryandroidx.Themes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v7.preference.PreferenceManager;
import android.util.Log;

import com.princeodzalasapp.fr.wmlibraryandroidx.R;
import com.princeodzalasapp.fr.wmlibraryandroidx.Services.Constantes;

public class ThemeColor {

    private static ThemeDelegate delegate;
    private static ThemeColors primaryColor = Defaults.primaryColor;
    private static ThemeColors accentColor = Defaults.accentColor;
    private static boolean isTranslucent = Defaults.trans;
    private static boolean isDark = Defaults.darkTheme;
    private static String themeString;

    public ThemeColor() {
    }

    public static void init(Context context) {
        themeString= PreferenceManager.getDefaultSharedPreferences(context).getString(Constantes.PREFERENCE_KEY, null);
        if (themeString == null) {
            primaryColor = Defaults.primaryColor;
            accentColor = Defaults.accentColor;
            isTranslucent = Defaults.trans;
            isDark = Defaults.darkTheme;
            themeString = generateThemeString();
        } else {
            initValues();
        }
        delegate = new ThemeDelegate(context, primaryColor, accentColor, isTranslucent, isDark);
    }

    public static void applyTheme(@NonNull Activity activity) {
        applyTheme(activity, true);
    }

    public static void applyTheme(@NonNull Activity activity, boolean overrideBase) {
        if (overrideBase) {
            activity.setTheme(getThemeDelegate().getStyleResBase());
        }
        activity.getTheme().applyStyle(getThemeDelegate().getStyleResPrimary(), true);
        activity.getTheme().applyStyle(getThemeDelegate().getStyleResAccent(), true);
    }

    private static void writeValues(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(Constantes.PREFERENCE_KEY, generateThemeString()).apply();
    }

    private static void initValues() {
        String [] colors = themeString.split(":");
        isDark = Boolean.parseBoolean(colors[0]);
        isTranslucent = Boolean.parseBoolean(colors[1]);
        primaryColor = ThemeColors.values()[Integer.parseInt(colors[2])];
        accentColor = ThemeColors.values()[Integer.parseInt(colors[3])];
    }

    private static String generateThemeString() {
        return isDark+ ":" + isTranslucent + ":" + primaryColor.ordinal() + ":" + accentColor.ordinal();
    }

    public static ThemeDelegate getThemeDelegate() {
        if (delegate==null) {
            Log.e(Constantes.LOG_TAG, "getThemeDelegate() called before init(Context). Call Colorful.init(Context) in your application class");
        }
        return delegate;
    }

    public static String getThemeString() {
        return themeString;
    }

    public enum ThemeColors {

        RED(R.style.primary0, R.style.accent0,new ColorPack(new ColorfulColor("#f44336"),new ColorfulColor("#d32f2f"))),
        PINK(R.style.primary1, R.style.accent1,new ColorPack(new ColorfulColor("#e91e63"),new ColorfulColor("#c2185b"))),
        PURPLE(R.style.primary2, R.style.accent2,new ColorPack(new ColorfulColor("#9c27b0"),new ColorfulColor("#7b1fa2"))),
        DEEP_PURPLE(R.style.primary3, R.style.accent3,new ColorPack(new ColorfulColor("#673ab7"),new ColorfulColor("#512da8"))),
        INDIGO(R.style.primary4, R.style.accent4,new ColorPack(new ColorfulColor("#3f51b5"),new ColorfulColor("#303f9f"))),
        BLUE(R.style.primary5, R.style.accent5,new ColorPack(new ColorfulColor("#2196f3"),new ColorfulColor("#1976d2"))),
        LIGHT_BLUE(R.style.primary6, R.style.accent6,new ColorPack(new ColorfulColor("#03a9f4"),new ColorfulColor("#0288d1"))),
        CYAN(R.style.primary7, R.style.accent7,new ColorPack(new ColorfulColor("#00bcd4"),new ColorfulColor("#0097a7"))),
        TEAL(R.style.primary8, R.style.accent8,new ColorPack(new ColorfulColor("#009688"),new ColorfulColor("#00796b"))),
        GREEN(R.style.primary9, R.style.accent9,new ColorPack(new ColorfulColor("#4caf50"),new ColorfulColor("#388e3c"))),
        LIGHT_GREEN(R.style.primary10, R.style.accent10,new ColorPack(new ColorfulColor("#8bc34a"),new ColorfulColor("#689f38"))),
        LIME(R.style.primary11, R.style.accent11,new ColorPack(new ColorfulColor("#cddc39"),new ColorfulColor("#a4b42b"))),
        YELLOW(R.style.primary12, R.style.accent12,new ColorPack(new ColorfulColor("#ffeb3b"),new ColorfulColor("#fbc02d"))),
        AMBER(R.style.primary13, R.style.accent13,new ColorPack(new ColorfulColor("#ffc107"),new ColorfulColor("#ffa000"))),
        ORANGE(R.style.primary14, R.style.accent14,new ColorPack(new ColorfulColor("#ff9800"),new ColorfulColor("#f57c00"))),
        DEEP_ORANGE(R.style.primary15, R.style.accent15,new ColorPack(new ColorfulColor("#ff5722"),new ColorfulColor("#e64a19"))),
        BROWN(R.style.primary16, R.style.accent16,new ColorPack(new ColorfulColor("#795548"),new ColorfulColor("#5d4037"))),
        GREY(R.style.primary17, R.style.accent17,new ColorPack(new ColorfulColor("#9e9e9e"),new ColorfulColor("#616161"))),
        BLUE_GREY(R.style.primary18, R.style.accent18,new ColorPack(new ColorfulColor("#607d8b"),new ColorfulColor("#455a64"))),
        WHITE(R.style.primary19, R.style.accent19,new ColorPack(new ColorfulColor("#ffffff"),new ColorfulColor("#ffffff"))),
        BLACK(R.style.primary20, R.style.accent20,new ColorPack(new ColorfulColor("#000000"), new ColorfulColor("#000000")));

        @StyleRes
        private int primaryRes;
        @StyleRes private int accentRes;
        private ColorPack color;

        ThemeColors(@StyleRes int colorRes, @StyleRes int darkColorRes, ColorPack color) {
            this.primaryRes = colorRes;
            this.accentRes = darkColorRes;
            this.color = color;
        }

        @StyleRes
        public int primaryStyle() {
            return primaryRes;
        }

        @StyleRes
        public int accentStyle() {
            return accentRes;
        }
        public ColorPack getColorPack(){
            return color;
        }
        public String themeName() {
            return "${themeColorInterface.primaryStyle()}|${themeColorInterface.accentStyle()}|${themeColorInterface.getColorPack().normal().asHex()}|${themeColorInterface.getColorPack().dark().asHex()}";
        }
    }

    public static Config config(Context context) {
        return new Config(context);
    }

    public static Defaults defaults() {
        return new Defaults();
    }

    public static class Defaults {

        private static ThemeColors primaryColor = ThemeColors.RED;
        private static ThemeColors accentColor = ThemeColors.DEEP_ORANGE;
        private static boolean trans=false;
        private static boolean darkTheme=false;

        public Defaults primaryColor(ThemeColors primary) {
            primaryColor = primary;
            return this;
        }

        public Defaults accentColor(ThemeColors accent) {
            accentColor = accent;
            return this;
        }

        public Defaults translucent(boolean translucent) {
            trans = translucent;
            return this;
        }

        public Defaults dark(boolean dark) {
            darkTheme = dark;
            return this;
        }

        //////////////////////////////////////////////////////

        public static ThemeColors getPrimaryColor() {
            return primaryColor;
        }

        public static ThemeColors getAccentColor() {
            return accentColor;
        }

        public static boolean isDarkTheme() {
            return isDark;
        }
    }

    public static class Config {
        private Context context;

        private Config(Context context) {
            this.context=context;
        }

        public Config primaryColor(ThemeColors primary) {
            primaryColor = primary;
            return this;
        }

        public Config accentColor(ThemeColors accent) {
            accentColor = accent;
            return this;
        }

        public Config translucent(boolean translucent) {
            isTranslucent = translucent;
            return this;
        }

        public Config dark(boolean dark) {
            isDark = dark;
            return this;
        }

        public void apply() {
            writeValues(context);
            themeString=generateThemeString();
            delegate = new ThemeDelegate(context, primaryColor, accentColor, isTranslucent, isDark);
        }
    }
}
