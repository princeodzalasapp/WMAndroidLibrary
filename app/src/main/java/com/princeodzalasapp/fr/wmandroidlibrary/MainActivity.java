package com.princeodzalasapp.fr.wmandroidlibrary;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.princeodzalasapp.fr.wmlibraryandroidx.Themes.ThemeColor;
import com.princeodzalasapp.fr.wmlibraryandroidx.Themes.Themes;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mContenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Themes.setTestColor(MainActivity.this);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        mContenu = findViewById(R.id.contenu);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Themes.setLightNoTransColor(ThemeColor.ThemeColors.BLUE, ThemeColor.ThemeColors.DEEP_ORANGE,MainActivity.this);
                    return true;
                case R.id.navigation_dashboard:
                    Themes.setLightNoTransColor(ThemeColor.ThemeColors.WHITE,ThemeColor.ThemeColors.ORANGE,MainActivity.this);
                    return true;
                case R.id.navigation_notifications:
                    Themes.setLightNoTransColor(ThemeColor.ThemeColors.YELLOW,ThemeColor.ThemeColors.INDIGO,MainActivity.this);
                    return true;
            }
            return false;
        }
    };

}
