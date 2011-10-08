package com.oneverse.dropbocs;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class DropBocsActivity extends Activity implements ActionBar.TabListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.oneverse.dropbocs.R.layout.main);
        ActionBar bar = getActionBar();

        bar.addTab(bar.newTab().setText("DropBox").setTabListener(this));
        bar.addTab(bar.newTab().setText("Google Docs").setTabListener(this));
        bar.addTab(bar.newTab().setText("Box.net").setTabListener(this));
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
