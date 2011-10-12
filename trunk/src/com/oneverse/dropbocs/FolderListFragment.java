package com.oneverse.dropbocs;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

/**
 *
 */
public class FolderListFragment extends android.app.ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(
                savedInstanceState);
        ListView lv = getListView();
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setCacheColorHint(Color.TRANSPARENT);
    }
}
