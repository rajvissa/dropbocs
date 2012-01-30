package com.oneverse.dropbocs;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class DropBocsActivity extends Activity implements ActionBar.TabListener {

    private int mThemeId = -1;
    private String[] mToggleLabels = {"Show Titles", "Hide Titles"};
    private View mActionBarView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null && savedInstanceState.getInt("theme", -1) != -1) {
            mThemeId = savedInstanceState.getInt("theme");
            this.setTheme(mThemeId);
        }

        setContentView(R.layout.main);
        ActionBar bar = getActionBar();
        String[] categories = getResources().getStringArray(R.array.categories);

        for (String category : categories) {
            bar.addTab(bar.newTab().setText(category).setTabListener(this));
        }

        mActionBarView = getLayoutInflater().inflate(
                R.layout.action_bar, null);

        bar.setCustomView(mActionBarView);
        bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_USE_LOGO);
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bar.setDisplayShowHomeEnabled(true);

        // If category is not saved to the savedInstanceState,
        // 0 is returned by default.
        if(savedInstanceState != null) {
            int category = savedInstanceState.getInt("category");
            bar.selectTab(bar.getTabAt(category));
        }
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }
}
