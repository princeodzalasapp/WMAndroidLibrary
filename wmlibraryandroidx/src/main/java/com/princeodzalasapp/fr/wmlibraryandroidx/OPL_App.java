package com.princeodzalasapp.fr.wmlibraryandroidx;

import android.app.Application;
import com.princeodzalasapp.fr.wmlibraryandroidx.Themes.ThemeColor;

public class OPL_App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ThemeColor.init(this);
    }
}
